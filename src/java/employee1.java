
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

@WebServlet("/employee1")
 public class employee1 extends HttpServlet {
   
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
            String empid = req.getParameter("id");
            String fname = req.getParameter("fname");
            String lname= req.getParameter("lname");
            String stuenroll= req.getParameter("stuenroll");
            String studept= req.getParameter("studept");
            String stucourse= req.getParameter("stucourse");
            String stuemail= req.getParameter("stuemail");
            String stufathersname= req.getParameter("stufathersname");
            String stumothersname= req.getParameter("stumothersname");
            String stuaddress= req.getParameter("stuaddress");
            String stuage= req.getParameter("stuage");
            String stugender= req.getParameter("stugender");
            String stureligion= req.getParameter("stureligion");
            String stucaste= req.getParameter("stucaste");
            String stuqualification= req.getParameter("stuqualification");
            String stumobileno= req.getParameter("stumobileno");
            
            pst = con.prepareStatement("insert into employee(id,fname,lname,enrollment,department,course,email,fathersname,mothersname,address,age,gender,religion,caste,qualification,mobileno)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ");
            pst.setString(1, empid);
            pst.setString(2, fname);
            pst.setString(3, lname);
            pst.setString(4, stuenroll);
            pst.setString(5, studept);
            pst.setString(6, stucourse);
            pst.setString(7, stuemail);
            pst.setString(8, stufathersname);
            pst.setString(9, stumothersname);
            pst.setString(10, stuaddress);
            pst.setString(11, stuage);
            pst.setString(12, stugender);
            pst.setString(13, stureligion);
            pst.setString(14, stucaste);
            pst.setString(15, stuqualification);
            pst.setString(16, stumobileno);
            
            pst.executeUpdate();
            
            out.println("<font color='green'>Record Addedddd</font>");
 
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
           
             out.println("<font color='red'>  Record Failed   </font>");
        } 
    }
  
}   

