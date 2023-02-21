package com.home.testtask.controller;

import com.home.testtask.dto.StudentDto;
import com.home.testtask.entity.Student;
import com.home.testtask.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/all")
    public List<Student> getAllStudents() {return studentService.getStudents(); }

    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping()
    public ResponseEntity<Student> removeStudent(@RequestParam(name = "id") Long id){
        studentService.deleteStudentById(id);
        return ResponseEntity.ok().build();
    }
}
