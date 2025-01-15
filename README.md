# JWT_Spring_Security 🚀 🔐

**Secure your Spring Boot applications with JSON Web Tokens (JWT)** using Spring Security. This repository demonstrates best practices for implementing JWT-based authentication and authorization in Spring applications.

---

## 🌟 Features
- 🎫 **JWT Authentication**: Robust token-based user authentication
- 🛡️ **Spring Security Integration**: Comprehensive security configuration
- 🔒 **Role-Based Authorization**: Flexible access control with user roles
- 🛠️ **Easy Configuration**: Modular and customizable security setup
- 📜 **Detailed Documentation**: Clear implementation guidelines

---

## 📦 Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/JWT_Spring_Security.git
   cd JWT_Spring_Security
   ```

2. **Configure application properties**
   Create `application.properties` in `src/main/resources`:
   ```properties
   server.port=8080
   jwt.secret=your_jwt_secret_key
   jwt.expiration=86400000
   ```

3. **Build the project**
   ```bash
   mvn clean install
   ```

---

## 🛠️ Usage

1. **Start the application**
   ```bash
   mvn spring-boot:run
   ```

2. **API Endpoints**
   - **Register**: `/api/auth/register` (POST) - Create new user account
   - **Login**: `/api/auth/login` (POST) - Authenticate and get JWT
   - **Protected**: `/api/secure` (GET) - Access secured endpoint

---

## 📝 Sample Request & Response

### 🔑 Login Endpoint
**Request:**
```json
{
  "username": "user@example.com",
  "password": "password123"
}
```

**Response:**
```json
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...",
  "type": "Bearer",
  "username": "user@example.com",
  "roles": ["ROLE_USER"]
}
```

### 🔒 Protected Route
**Request Header:**
```
Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...
```

**Response:**
```json
{
  "message": "Protected resource accessed successfully!"
}
```

---

## 📂 Project Structure
```plaintext
JWT_Spring_Security/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── config/
│   │   │   │   ├── SecurityConfig.java
│   │   │   │   └── JwtConfig.java
│   │   │   ├── controller/
│   │   │   │   └── AuthController.java
│   │   │   ├── model/
│   │   │   │   └── User.java
│   │   │   ├── security/
│   │   │   │   ├── JwtTokenProvider.java
│   │   │   │   └── JwtAuthenticationFilter.java
│   │   │   └── service/
│   │   │       └── UserService.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
└── pom.xml
```

---

## 🛡️ Security Best Practices
- Use strong secret keys for JWT signing
- Implement token expiration
- Enable CORS and CSRF protection
- Use secure password hashing (BCrypt)
- Implement refresh token mechanism
- Regular security updates and patches

---

## 🤝 Contributing
Contributions are welcome! 🎉 Please feel free to submit issues and pull requests.

---

## 📜 License
This project is licensed under the MIT License.

---

## 📧 Contact
For questions and support, contact [chathupachamika765@gmail.com](chathupachamika765@gmail.com)

---
Made with ❤️ by the Chathupa Chamika
