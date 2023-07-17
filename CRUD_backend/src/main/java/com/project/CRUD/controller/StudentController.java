package com.project.CRUD.controller;

import com.project.CRUD.model.Student;
import com.project.CRUD.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(allowedHeaders = "*",origins="*")

public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/registerStudent")
    public Student registerStudent(@RequestBody Student student){
        return studentService.registerStudent(student);

    }

    @GetMapping("/getStudents")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @DeleteMapping("/deleteStudent")
    public void deleteStudent(Integer id){

    }
}
