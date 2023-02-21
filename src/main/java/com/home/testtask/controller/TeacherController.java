package com.home.testtask.controller;

import com.home.testtask.entity.Teacher;
import com.home.testtask.service.TeacherService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/teacher")
public class TeacherController {

    private final TeacherService teacherService;

    @GetMapping("/all")
    public ResponseEntity<List<Teacher>> getAllTeacher(){
        return ResponseEntity.ok(teacherService.getAllTeacher());
    }
}
