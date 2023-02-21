package com.home.testtask.controller;

import com.home.testtask.entity.Student;
import com.home.testtask.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/all")
    public List<Student> getAllStudents() {return studentService.getStudents(); }
}
