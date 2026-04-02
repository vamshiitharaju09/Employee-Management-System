# 🚀 Employee Management System API

## 📌 Project Overview
This project is a RESTful API for managing employee data, built using Spring Boot.  
It allows users to perform complete CRUD operations with a clean layered architecture.

The application follows best practices such as DTO pattern, Mapper usage, and Global Exception Handling.

---

## 🛠️ Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL
- Postman

---

## ✨ Features
- ✅ Create Employee
- ✅ Get All Employees
- ✅ Get Employee by ID
- ✅ Update Employee
- ✅ Delete Employee
- ✅ DTO (Data Transfer Object) implementation
- ✅ Mapper class for conversion (Entity ↔ DTO)
- ✅ Global Exception Handling
- ✅ RESTful API design

---

## 🧱 Project Architecture
This project follows a layered architecture:

- **Controller Layer** → Handles HTTP requests  
- **Service Layer** → Contains business logic  
- **Repository Layer** → Interacts with database  
- **Entity Layer** → Database model  
- **DTO Layer** → Data transfer between layers  
- **Mapper Layer** → Converts Entity ↔ DTO  
- **Exception Layer** → Handles errors globally  

---

## 🔗 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST   | /api/employees        | Create a new employee |
| GET    | /api/employees        | Get all employees |
| GET    | /api/employees/{id}   | Get employee by ID |
| PUT    | /api/employees/{id}   | Update employee |
| DELETE | /api/employees/{id}   | Delete employee |

---

## 🧪 Sample Request (POST)

```json
{
  "firstName": "Vamshi",
  "lastName": "Krishna",
  "email": "vamshi@gmail.com"
}
