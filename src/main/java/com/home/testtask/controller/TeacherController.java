package com.home.testtask.controller;

import com.home.testtask.entity.Teacher;
import com.home.testtask.service.TeacherService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @PostMapping("/add")
    ResponseEntity<Teacher> addTeacher(@RequestBody Teacher teacher){
        teacherService.addTeacher(teacher);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping()
    public ResponseEntity<Teacher> deleteTeacher(@RequestParam(name = "id") Long id){
        teacherService.deleteTeacher(id);
        return ResponseEntity.ok().build();
    }
}
