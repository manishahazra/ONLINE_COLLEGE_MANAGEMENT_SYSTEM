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

@WebServlet("/Editreturn")
public class Editreturn extends HttpServlet {    
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    int row;

    public void doGet(HttpServletRequest req,HttpServletResponse rsp ) throws IOException,ServletException
    {
        
        rsp.setContentType("text/html");
        PrintWriter out = rsp.getWriter();
        
        String eid = req.getParameter("id");
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/staff","root","Sys@tem123#mon");
           
           pst = con.prepareStatement("select * from employee where id = ?");
           pst.setString(1, eid);
           rs = pst.executeQuery();
           
           while(rs.next())
           {
               out.print("<form action='EditServlet' method='POST'>");
                out.print("<table>");
               
                out.print("<tr> <td>EmpID</td>    <td> <input type='text' name ='empid' id='empid' value= '" + rs.getString("id") + "'/> </td> </tr>");
                out.print("<tr> <td>Firstname</td>    <td> <input type='text' name ='fname' id='fname' value= '" + rs.getString("fname") + "'/> </td> </tr>");
                out.print("<tr> <td>Lastname</td>    <td> <input type='text' name ='lname' id='lname' value= '" + rs.getString("lname") + "'/> </td> </tr>");
                out.print("<tr> <td>Enrollment</td>    <td> <input type='text' name ='enrollment' id='enrollment' value= '" + rs.getString("enrollment") + "'/> </td> </tr>");
                out.print("<tr> <td>Department</td>    <td> <input type='text' name ='department' id='department' value= '" + rs.getString("department") + "'/> </td> </tr>");
                out.print("<tr> <td>Course</td>    <td> <input type='text' name ='course' id='course' value= '" + rs.getString("course") + "'/> </td> </tr>");
                out.print("<tr> <td>Email</td>    <td> <input type='text' name ='email' id='email' value= '" + rs.getString("email") + "'/> </td> </tr>");
                out.print("<tr> <td>Father's Name</td>    <td> <input type='text' name ='fathersname' id='fathersname' value= '" + rs.getString("fathersname") + "'/> </td> </tr>");
                out.print("<tr> <td>Mother's Name</td>    <td> <input type='text' name ='mothersname' id='mothersname' value= '" + rs.getString("mothersname") + "'/> </td> </tr>");
                out.print("<tr> <td>Address</td>    <td> <input type='text' name ='address' id='address' value= '" + rs.getString("address") + "'/> </td> </tr>");
                out.print("<tr> <td>Age</td>    <td> <input type='text' name ='age' id='age' value= '" + rs.getString("age") + "'/> </td> </tr>");
                out.print("<tr> <td>Gender</td>    <td> <input type='text' name ='gender' id='gender' value= '" + rs.getString("gender") + "'/> </td> </tr>");
                out.print("<tr> <td>Religion</td>    <td> <input type='text' name ='religion' id='religion' value= '" + rs.getString("religion") + "'/> </td> </tr>");
                out.print("<tr> <td>Caste</td>    <td> <input type='text' name ='caste' id='caste' value= '" + rs.getString("caste") + "'/> </td> </tr>");
                out.print("<tr> <td>Qualification</td>    <td> <input type='text' name ='qualification' id='qualification' value= '" + rs.getString("qualification") + "'/> </td> </tr>");
                out.print("<tr> <td>Mobile No</td>    <td> <input type='text' name ='mobileno' id='mobileno' value= '" + rs.getString("mobileno") + "'/> </td> </tr>");
                out.print("<tr>  <td colspan ='2'> <input type='submit'  value= 'Edit'/> </td> </tr>");
                out.print("</table>");
                out.print("</form>");
               
           }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
           
             out.println("<font color='red'>  Record Failed   </font>");
 
        }
    }

}




















