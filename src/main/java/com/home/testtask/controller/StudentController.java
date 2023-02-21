package com.home.testtask.controller;

import com.home.testtask.entity.Student;
import com.home.testtask.repository.StudentRepository;
import com.home.testtask.service.StudentService;
import com.home.testtask.service.impl.StudentServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    StudentService studentService;
    StudentRepository studentRepository;

    @GetMapping("/allstudents")
    public List<Student> getAllStudent(List<Student> studentList){
        return studentService.getStudentList();
    }

    @GetMapping("/all")
    public ResponseEntity<List<Student>> showall(){
       return ResponseEntity.ok().body(studentRepository.findAll());
    }

    @GetMapping("/searchbyid")
    public List<Student> searchById(@RequestParam(value = "id") Long id){
        return studentRepository.getStudentById(id);
    }
}
