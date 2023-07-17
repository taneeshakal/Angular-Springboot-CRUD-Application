package com.project.CRUD.service;

import com.project.CRUD.model.Student;
import com.project.CRUD.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student registerStudent(Student student){
        return studentRepository.save(student);  //save comes from the extended crud repo

    }

    public List<Student> getStudents(){
        return (List<Student>) studentRepository.findAll();   //findAll is a predefined method. It will return list of students
    }

    public void deleteStudent(Integer id){
        studentRepository.deleteById(id);
    }
}
