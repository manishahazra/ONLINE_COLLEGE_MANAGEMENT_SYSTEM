// A simple validation to check if the username and password match
function validateLogin() {
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;

    // You can replace this with your actual validation or use an API call for real authentication
    if (username === 'admin' && password === 'system') {
        // If the login is successful, redirect to the next page (e.g. dashboard2.html)
        window.location.href = 'dashboard2.html';
        return false; // Prevent form submission
    } else {
        // Show error message if username/password is incorrect
        document.getElementById('error-message').style.display = 'block';
        return false; // Prevent form submission
    }
}