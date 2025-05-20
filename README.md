# User Service Microservice

This is a **User Service** microservice built with **Spring Boot**, using **JWT** for authentication and **MySQL** as the database. It handles user registration and login, and securely generates tokens for authenticated sessions.

## 🔧 Technologies Used

- Java 17+
- Spring Boot 3.x
- Spring Security
- JWT (JSON Web Tokens)
- MySQL
- Maven

## 🚀 Features

- ✅ User Registration with validations
- ✅ User Login with JWT token generation
- ✅ Password encryption using BCrypt
- ✅ Custom exception handling
- ✅ Token-based authentication
- ✅ RESTful APIs

## 📁 Project Structure

user-service/
├── controller/ # REST controllers
├── service/ # Service interfaces and implementations
├── repository/ # JPA repositories
├── model/ # Entity classes
├── security/ # JWT filter and security config
├── util/ # JWT utility class
└── application.properties

sql
Copy
Edit

## ⚙️ Configuration

Update your `application.properties` or `application.yml` with your DB config:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/userdb
spring.datasource.username=yourUsername
spring.datasource.password=yourPassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

jwt.secret=yourSecretKeyHere
🛠️ API Endpoints
Endpoint	Method	Description
/api/user/register	POST	Register new user
/api/user/login	POST	Authenticate & get token

🔐 JWT Example Response
json
Copy
Edit
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5..."
}
Use this token as a Bearer token in headers for protected APIs.

📦 How to Run
bash
Copy
Edit
# Step 1: Clone the repo
git clone https://github.com/your-username/user-service-microservice.git
cd user-service-microservice

# Step 2: Build and run
mvn spring-boot:run
