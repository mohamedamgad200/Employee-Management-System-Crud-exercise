# Employee Management System - CRUD RESTful API

## 📌 Description
A CRUD RESTful API for managing employees, built using Spring Boot, Spring Data JPA, Lombok, DTO/Mapper patterns, and PostgreSQL. This API allows users to create, read, update, and delete employee records with a clean architecture approach.

## 🛠️ Technologies Used
- **Spring Boot** (REST API)
- **Spring Data JPA** (Database interaction)
- **Lombok** (Boilerplate code reduction)
- **MapStruct** (DTO to Entity mapping)
- **PostgreSQL** (Database)
- **Maven** (Dependency management)

---

## ⚙️ Installation and Setup
1. **Clone the repository:**  
   ```bash
   git clone https://github.com/yourusername/employee-management-api.git
   cd employee-management-api
   ```
2. **Configure Database:**  
   Update `application.properties` with your PostgreSQL database credentials:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/employee_db
   spring.datasource.username=postgres
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   ```
3. **Run the application:**  
   ```bash
   mvn spring-boot:run
   ```
---

## 🚀 API Endpoints
| Method | Endpoint                | Description                |
|--------|-----------------------|----------------------------|
| GET    | `/api/employees`      | Get all employees         |
| GET    | `/api/employees/{id}` | Get employee by ID        |
| POST   | `/api/employees`      | Create a new employee     |
| PUT    | `/api/employees/{id}` | Update employee by ID     |
| DELETE | `/api/employees/{id}` | Delete employee by ID     |

---

## 📂 Project Structure
```
📁 src
 ┣ 📂 main
 ┃ ┣ 📂 java
 ┃ ┃ ┣ 📂 com.example.employeesystem
 ┃ ┃ ┃ ┣ 📂 controller
 ┃ ┃ ┃ ┃ ┗ EmployeeController.java
 ┃ ┃ ┃ ┣ 📂 dto
 ┃ ┃ ┃ ┃ ┗ EmployeeDTO.java
 ┃ ┃ ┃ ┣ 📂 mapper
 ┃ ┃ ┃ ┃ ┗ EmployeeMapper.java
 ┃ ┃ ┃ ┣ 📂 entity
 ┃ ┃ ┃ ┃ ┗ Employee.java
 ┃ ┃ ┃ ┣ 📂 repository
 ┃ ┃ ┃ ┃ ┗ EmployeeRepository.java
 ┃ ┃ ┃ ┣ 📂 service
 ┃ ┃ ┃ ┃ ┗ EmployeeService.java
 ┃ ┃ ┃ ┗ EmployeeManagementApplication.java
 ┃ ┣ 📂 resources
 ┃ ┃ ┗ application.properties
 ┗ 📄 pom.xml
```
---

## 🧑‍💻 Author
- **Mohamed Amgad ** - [GitHub Profile]([(https://github.com/mohamedamgad200)])

Feel free to contribute to this repository by submitting issues or pull requests!

---
**⭐ If you find this project useful, please give it a star on GitHub! ⭐**
