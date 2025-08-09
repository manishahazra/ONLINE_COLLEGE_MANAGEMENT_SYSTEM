function validateForm() {
  var id = document.getElementById('id').value;
  var name = document.getElementById('name').value;
  var enrollment_number = document.getElementById('enrollment_number').value;
  var email = document.getElementById('email').value;
  var fname = document.getElementById('fathersname').value;
  var mname = document.getElementById('mothersname').value;
  var address = document.getElementById('address').value;
  var age = document.getElementById('age').value;
  var gender = document.getElementById('gender').value;
  var religion = document.getElementById('religion').value;
  var caste = document.getElementById('caste').value;
  var qualification = document.getElementById('qualification').value;
  var mobileno = document.getElementById('mobileno').value;
  if (id === "" || name === "" ||  enrollment === "" || email === ""  || fname === "" || mname === "" || address === "" || age === "" || general === "" || religion === "" || caste === "" || qualification === "" || mobileno === "") {
    alert("All fields must be filled out.");
    return false;
  }
  return true;
}
