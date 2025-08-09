ONLINE COLLEGE MANAGEMENT SYSTEM
📌 Project Overview
The Online College Management System is a web-based application designed to help colleges manage their day-to-day activities in a simple and efficient way. This system provides different modules for Admin, Faculty, and Students to manage information such as student details, courses, results, attendance, and more — all from one platform.
✨ Features
🔹 Admin Panel
- Add, update, or delete student details
- Manage faculty information
- Assign subjects and courses
- View and manage attendance
- Generate and view reports
🔹 Faculty Panel
- View assigned subjects/courses
- Mark and manage student attendance
- Upload marks and results
- Communicate with students
🔹 Student Panel
- View personal profile and academic details
- Check attendance percentage
- View results and marks
- Receive notices and updates from the college
🛠 Technologies Used
- Frontend: HTML, CSS, JavaScript
- Backend: Java Servlet, JSP
- Database: MySQL
- Server: Apache Tomcat
📂 Project Structure
ONLINE_COLLEGE_MANAGEMENT_SYSTEM/
│
├── src/                 # Java Servlet & JSP files
├── web/                 # HTML, CSS, JS files
├── database/            # MySQL scripts for database
└── README.md            # Project documentation
⚙️ Installation & Setup
Follow these steps to run the project locally:

1. Clone the repository
   git clone https://github.com/manishahazra/ONLINE_COLLEGE_MANAGEMENT_SYSTEM.git

2. Import the project
   - Open in Eclipse or any Java IDE that supports Servlets/JSP.

3. Setup the database
   - Create a MySQL database (e.g., college_management)
   - Import the .sql file from the database/ folder into MySQL

4. Configure the connection
   - Update the database username & password in the DB Connection file inside src/

5. Deploy on Apache Tomcat
   - Add the project to Tomcat server and start it

6. Access the system
   - Open your browser and go to: http://localhost:8080/ONLINE_COLLEGE_MANAGEMENT_SYSTEM
🔑 Default Login Credentials
Admin:
- Username: admin
- Password: admin123

Faculty / Student:
- Credentials will be provided by the Admin.
📢 Future Improvements
- Add online fee payment system
- Implement email/SMS notifications
- Add student performance analytics
🤝 Contributing
Feel free to fork this repository and contribute.
To contribute:
1. Fork the repo
2. Create a new branch
3. Make your changes
4. Submit a pull request
📜 License
This project is for educational purposes only.
