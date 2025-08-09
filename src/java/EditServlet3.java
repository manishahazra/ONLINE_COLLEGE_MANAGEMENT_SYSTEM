import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EditServlet3")
public class EditServlet3 extends HttpServlet  {
    
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    int row;

    public void doPost(HttpServletRequest req,HttpServletResponse rsp ) throws IOException,ServletException
    {
        
        rsp.setContentType("text/html");
        PrintWriter out = rsp.getWriter();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/staff","root","Sys@tem123#mon");
           
             String empid = req.getParameter("empid");
             String fname = req.getParameter("fname");
             String lname = req.getParameter("lname");
             String stuenroll = req.getParameter("enrollment");
             String studept = req.getParameter("department");
             String stucourse = req.getParameter("course");
             String stuemail = req.getParameter("email");
             String stufathersname = req.getParameter("fathersname");
             String stumothersname = req.getParameter("mothersname");
             String stuaddress = req.getParameter("address");
             String stuage = req.getParameter("age");
             String stugender = req.getParameter("gender");
             String stureligion = req.getParameter("religion");
             String stucaste = req.getParameter("caste");
             String stuqualification = req.getParameter("qualification");
             String stumobileno = req.getParameter("mobileno");
             
             pst = con.prepareStatement("update employee set fname = ?, lname = ?, enrollment = ? , department = ? , course = ? , email = ?, fathersname = ?, mothersname = ?, address = ?, age = ?, gender = ?, religion = ? , caste = ? , qualification = ?, mobileno = ? where id = ?");
             pst.setString(1, fname);
             pst.setString(2, lname);
             pst.setString(3, stuenroll);
             pst.setString(4, studept);
             pst.setString(5, stucourse);
             pst.setString(6, stuemail);
             pst.setString(7, stufathersname);
             pst.setString(8, stumothersname);
             pst.setString(9, stuaddress);
             pst.setString(10, stuage);
             pst.setString(11, stugender);
             pst.setString(12, stureligion);
             pst.setString(13, stucaste);
             pst.setString(14, stuqualification);
             pst.setString(15, stumobileno);
             pst.setString(16, empid);
             row = pst.executeUpdate();
             
              out.println("<font color='green'>Record Updateeeedd </font>");
   
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
           
             out.println("<font color='red'>  Record Failed   </font>");
 
        }

    }
  
}