package com.SpringProject.librarymanagementsystem.Repository;

import com.SpringProject.librarymanagementsystem.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    // findBy{attribute name}
    Student findByEmail(String email);  // custom search based on attribute
    List <Student> findByAge(int age);
}
