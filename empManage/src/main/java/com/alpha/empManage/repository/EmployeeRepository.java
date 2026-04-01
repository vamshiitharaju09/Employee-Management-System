package com.alpha.empManage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpha.empManage.entity.Employee;
public interface EmployeeRepository  extends JpaRepository<Employee,Long>{

}









/* In a Spring Boot application, the Repository Layer is mainly used to interact with the database.
 * It acts as a bridge between your application and the data source.
 * 🔹 What is Repository Layer?
      The Repository Layer is responsible for:
     -> Performing CRUD operations (Create, Read, Update, Delete)
     -> Communicating with the database using JPA / Hibernate.
     -> Reducing boilerplate code (no need to write SQL manually in most cases)
     
  🔹 What is JpaRepository?
       -> JpaRepository is an interface in Spring Data JPA that provides ready-made methods to interact with the database.
       ->It is used in the Repository Layer so you don’t need to write SQL for common operations.
       ->When you extend JpaRepository, you get methods:

            save()
            findAll()
            findById()
            deleteById()
 * 
 */
