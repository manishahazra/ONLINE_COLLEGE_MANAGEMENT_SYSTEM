import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/viewstudentlist")
public class viewstudentlist extends HttpServlet {
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    int row;

    public void doGet(HttpServletRequest req,HttpServletResponse rsp ) throws IOException,ServletException
    {
        
        rsp.setContentType("text/html");
        PrintWriter out = rsp.getWriter();
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/staff","root","Sys@tem123#mon");
           
            String sql;
            
            sql = "select * from employee";
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            
            out.println("<table cellspacing='0' width='350px' border='1'>");
            out.println("<tr>");
            out.println("<td> EmpID </td>");
            out.println("<td> First Name </td>");
            out.println("<td> Last Name </td>");
            out.println("<td> Enrollment </td>");
            out.println("<td> Department </td>");
            out.println("<td> Course </td>");
            out.println("<td> Email </td>");
            out.println("<td> Father's Name </td>");
            out.println("<td> Mother's Name </td>");
            out.println("<td> Address</td>");
            out.println("<td> Age </td>");
            out.println("<td> Gender </td>");
            out.println("<td> Religion </td>");
            out.println("<td> Caste </td>");
            out.println("<td> Qualification </td>");
            out.println("<td> Mobile No </td>");
            out.println("<td> Edit </td>");
            out.println("<td> Delete </td>");
            
            out.println("</tr>");
            
            while(rs.next())
            {
             out.println("<tr>");
             out.println("<td>"  + rs.getString("id")   +  "</td>");
             out.println("<td>"  + rs.getString("fname")   +  "</td>");  
             out.println("<td>"  + rs.getString("lname")   +  "</td>");  
             out.println("<td>"  + rs.getString("enrollment")   +  "</td>");
             out.println("<td>"  + rs.getString("department")   +  "</td>");  
             out.println("<td>"  + rs.getString("course")   +  "</td>");  
             out.println("<td>"  + rs.getString("email")   +  "</td>");
             out.println("<td>"  + rs.getString("fathersname")   +  "</td>");  
             out.println("<td>"  + rs.getString("mothersname")   +  "</td>");  
             out.println("<td>"  + rs.getString("address")   +  "</td>");
             out.println("<td>"  + rs.getString("age")   +  "</td>");  
             out.println("<td>"  + rs.getString("gender")   +  "</td>");  
             out.println("<td>"  + rs.getString("religion")   +  "</td>");
             out.println("<td>"  + rs.getString("caste")   +  "</td>");  
             out.println("<td>"  + rs.getString("qualification")   +  "</td>");  
             out.println("<td>"  + rs.getString("mobileno")   +  "</td>");
             out.println("<td>"  + "<a href='Editreturn?id=" +  rs.getString("id")  + "'> Edit </a>" + "</td>");
             out.println("<td>"  + "<a href='Delete?id=" +  rs.getString("id")  + "'> Delete </a>" + "</td>");
             out.println("</tr>");

            }
            
            out.println("</table>");
 
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
           
             out.println("<font color='red'>  Record Failed   </font>");  
        }
    }  
}