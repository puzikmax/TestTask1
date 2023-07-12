package com.home.testtask.controller;

import com.home.testtask.entity.ClassRoom;
import com.home.testtask.entity.Student;
import com.home.testtask.entity.Teacher;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/classroom")
public class ClassRoomController {

    @GetMapping("/all")
    public ResponseEntity<ClassRoom> listStudentOfClass(){
        return ResponseEntity.ok().build();
    }

    @PostMapping("/addteacher")
    public ResponseEntity<ClassRoom> addTeacherToCLassRoom(@RequestBody Teacher teacher){
        return ResponseEntity.ok().build();
    }

    @PostMapping("/addstudent")
    public ResponseEntity<ClassRoom> addStudentToClassRoom(@RequestBody Student student){
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/deletestudent")
    public void deleteStudentFromClassRoom(@RequestParam(name = "classroom") ClassRoom classRoom,
                                           @RequestParam(name = "student") Student student){
    }
    @DeleteMapping("/deletetaecher")
    public void deleteTeacherFromClassRoom(@RequestParam(name = "classroom") ClassRoom classRoom,
                                           @RequestParam(name = "teacher") Teacher teacher){

    }

}
