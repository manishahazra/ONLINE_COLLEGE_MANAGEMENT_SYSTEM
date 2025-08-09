import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Search3 extends HttpServlet {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/college";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Sys@tem123#mon";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String searchQuery = request.getParameter("search");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish database connection
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            
            // Prepare the SQL query
            String sql = "SELECT * FROM otherstaff WHERE name LIKE ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, "%" + searchQuery + "%");
            // Execute the query
            ResultSet resultSet = statement.executeQuery();
            
            out.println("<html><body>");
            out.println("<h2>Search Results:</h2>");
            
            // Display results in a table
            out.println("<table border='1'><tr><th>id</th><th>name</th><th>enrollment</th><th>department</th>"
                    + "<th>course</th><th>email</th><th>mobile</th></tr>");
            while (resultSet.next()) {
                out.println("<tr>");
                out.println("<td>" + resultSet.getString("id") + "</td>");
                out.println("<td>" + resultSet.getString("name") + "</td>");
                out.println("<td>" + resultSet.getString("enrollment") + "</td>");
                out.println("<td>" + resultSet.getString("department") + "</td>");
                out.println("<td>" + resultSet.getString("course") + "</td>");
                out.println("<td>" + resultSet.getString("email") + "</td>");
                out.println("<td>" + resultSet.getString("mobile") + "</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            
            out.println("</body></html>");
            
            // Close resources
            resultSet.close();
            statement.close();
            connection.close();
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println("<p>Error: " + e.getMessage() + "</p>");
        }
    }
}
