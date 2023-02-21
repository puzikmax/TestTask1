package com.home.testtask.service;

import com.home.testtask.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudents();
    void addStudent(Student student);
    void deleteStudentById(Long id);

}
