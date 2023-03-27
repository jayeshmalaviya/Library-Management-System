package com.SpringProject.librarymanagementsystem.Controller;

import com.SpringProject.librarymanagementsystem.DTO.StudentRequestDto;
import com.SpringProject.librarymanagementsystem.DTO.StudentResponseDto;
import com.SpringProject.librarymanagementsystem.DTO.StudentUpdateEmailRequestDto;
import com.SpringProject.librarymanagementsystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody StudentRequestDto studentRequestDto){
        studentService.addStudent(studentRequestDto);
        return "Student has been added";
    }

    @GetMapping ("/find_by_email")
    public String findStudentByEmail(@RequestParam("email") String email){

        return studentService.findByEmail(email);
    }

    @PutMapping("/update_email")
    public StudentResponseDto updateEmail(@RequestBody StudentUpdateEmailRequestDto  studentUpdateEmailRequestDto){
        return studentService.updateEmail (studentUpdateEmailRequestDto);
    }
}
