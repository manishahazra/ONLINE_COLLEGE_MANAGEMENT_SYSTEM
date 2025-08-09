
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>College Student Registration Form</title>
  <link rel="stylesheet" href="style5.css">
  <script src="script5.jsp"></script>
</head>
<body>
  <h2>College Student Registration Form</h2>
  <form action="StudentServlet" method="post" onsubmit="return validateForm()">
      
    <label for="id">ID:</label>
    <input type="number" id="id" name="id" required>

      
    <label for="studentName">Student Name:</label>
    <input type="text" id="studentName" name="studentName" required>

    <label for="enrollmentNumber">Enrollment Number:</label>
    <input type="text" id="enrollmentNumber" name="enrollmentNumber" required>

    <label for="department">Department:</label>
    <input type="text" id="department" name="department" required>

    <label for="course">Course(Under):</label>
    <input type="text" id="course" name="course" required>

    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required>

    <label for="fathersname">Father's Name:</label>
    <input type="text" id="fathersname" name="fathersname" required>
    
    <label for="mothersname">Mother's Name:</label>
    <input type="text" id="mothersname" name="mothersname" required>
    
    <label for="address">Address:</label>
    <input type="text" id="address" name="address" required>
    
    <label for="age">Age:</label>
    <input type="number" id="age" name="age" required>
    
    <label for="gender">Gender:</label>
    <input type="text" id="gender" name="gender" required>
    
    
    <label for="religion">Religion:</label>
    <input type="text" id="religiion" name="religion" required>
    
    <label for="caste">Caste:</label>
    <input type="text" id="caste" name="caste" required>
    
        <label for="qualification">Qualification:</label>
    <input type="text" id="qualification" name="qualification" required>

    
    <label for="mobileno">Mobile No:</label>
    <input type="number" id="mobileno" name="mobileno" required>

    
    <button type="submit">Register</button>
    <input type="reset" value="Clear">
  </form>
</body>
</html>
