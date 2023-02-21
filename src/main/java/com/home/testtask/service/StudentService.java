package com.home.testtask.service;

import com.home.testtask.dto.StudentDto;
import com.home.testtask.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudents();
    Student addStudent(Student student);
    void deleteStudentById(Long id);
}
