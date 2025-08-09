import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String enrollment_number = request.getParameter("enrollment_number");
        String department = request.getParameter("department");
        String course = request.getParameter("course");
        String email = request.getParameter("email");
        String fathersname = request.getParameter("fathersname");
        String mothersname = request.getParameter("mothersname");
        String address = request.getParameter("address");
        String age = request.getParameter("age");
        String gender = request.getParameter("gender");
        String religion = request.getParameter("religion");
        String caste = request.getParameter("caste");
        String qualification = request.getParameter("qualification");
         String mobileno = request.getParameter("mobileno");
        
        // Save to database
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Sys@tem123#mon");
            PreparedStatement stmt = con.prepareStatement("INSERT INTO students (id, name, enrollment_number, department, course, email, fathersname, mothersname, address, age, gender, religion, caste, qualification, mobileno) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, id);
            stmt.setString(2, name);
            stmt.setString(3, enrollment_number);
            stmt.setString(4, department);
            stmt.setString(5, course);
            stmt.setString(6, email);
            stmt.setString(7, fathersname);
            stmt.setString(8, mothersname);
            stmt.setString(9, address);
            stmt.setString(10, age);
            stmt.setString(11, gender);
            stmt.setString(12, religion);
            stmt.setString(13, caste);
            stmt.setString(14, qualification);
            stmt.setString(15, mobileno);
            stmt.executeUpdate();

            // Generate PDF
            Document document = new Document();
            PdfWriter.getInstance(document, response.getOutputStream());
            document.open();
            document.add(new Paragraph("Student Registration Details"));
            document.add(new Paragraph("ID: " + id));
            document.add(new Paragraph("StudentName: " + name));
            document.add(new Paragraph("Enrollment_Number: " + enrollment_number));
            document.add(new Paragraph("Department: " + department));
            document.add(new Paragraph("Course: " + course));
            document.add(new Paragraph("Email: " + email));
            document.add(new Paragraph("Fathersname: " + fathersname));
            document.add(new Paragraph("Mothersname: " + mothersname));
            document.add(new Paragraph("Address: " + address));
            document.add(new Paragraph("Age: " + age));
            document.add(new Paragraph("Gender: " + gender));
            document.add(new Paragraph("Religion: " + religion));
            document.add(new Paragraph("Caste: " + caste));
            document.add(new Paragraph("Qualification: " + qualification));
            document.add(new Paragraph("Mobile No: " + mobileno));
            document.close();
            response.setContentType("application/pdf");
            response.getOutputStream().flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
