import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/AdministratorCollege")
public class AdministratorCollege extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String enrollment = request.getParameter("enrollment");
        String department = request.getParameter("department");
        String course = request.getParameter("course");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        
        // Save to database
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Sys@tem123#mon");
            PreparedStatement stmt = con.prepareStatement("INSERT INTO administrator (id, name, enrollment, department, course, email,  mobile) VALUES (?, ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, id);
            stmt.setString(2, name);
            stmt.setString(3, enrollment);
            stmt.setString(4, department);
            stmt.setString(5, course);
            stmt.setString(6, email);
            stmt.setString(7, mobile);
            stmt.executeUpdate();

            // Generate PDF
            Document document = new Document();
            PdfWriter.getInstance(document, response.getOutputStream());
            document.open();
            document.add(new Paragraph("College Student Registration Details"));
            document.add(new Paragraph("ID: " + id));
            document.add(new Paragraph("Administrator Name: " + name));
            document.add(new Paragraph("Enrollment: " + enrollment));
            document.add(new Paragraph("Department: " + department));
            document.add(new Paragraph("Course: " + course));
            document.add(new Paragraph("Email: " + email));
            document.add(new Paragraph("Mobile No: " + mobile));
            document.close();
            response.setContentType("application/pdf");
            response.getOutputStream().flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
