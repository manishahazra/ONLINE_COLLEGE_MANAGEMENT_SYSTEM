
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>College Administrator Registration Form</title>
  <link rel="stylesheet" href="style5.css">
  <script src="script6.jsp"></script>
</head>
<body>
  <h2>College Administrator Registration Form</h2>
  <form action="AdministratorCollege" method="post" onsubmit="return validateForm()">
         
    <label for="id">ID:</label>
    <input type="number" id="id" name="id" required>
      
    <label for="name">Administrator Name:</label>
    <input type="text" id="name" name="name" required>

    <label for="enrollment">Enrollment Number:</label>
    <input type="text" id="enrollment" name="enrollment" required>

    <label for="department">Department:</label>
    <input type="text" id="department" name="department" required>

    <label for="course">Course(Under):</label>
    <input type="text" id="course" name="course" required>

    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required>
    
    <label for="mobile">Mobile No:</label>
    <input type="number" id="mobile" name="mobile" required>

    <button type="submit">Register</button>
    <input type="reset" value="Clear">
  </form>
</body>
</html>
