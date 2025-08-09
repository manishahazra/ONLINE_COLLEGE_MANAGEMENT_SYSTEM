function validateForm() {
  var id = document.getElementById('id').value;
  var name = document.getElementById('Othersstaff').value;
  var enrollment = document.getElementById('enrollment').value;
  var department = document.getElementById('department').value;
  var course = document.getElementById('course').value;
  var email = document.getElementById('email').value;
  var mobile = document.getElementById('mobile').value;
  
  if (id === "" || name === "" ||  enrollment === "" || department === ""  || course === "" || email === "" || mobile === "" ) {
    alert("All fields must be filled out.");
    return false;
  }
  return true;
}
