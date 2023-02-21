package com.home.testtask.service;

import com.home.testtask.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> sortStudentByName(List<Student> studentList);
    List<Student> sortStudentBySurname(List<Student> studentList);
    List<Student> sortStudentByDateOfBirghtday(List<Student> studentList);
    List<Student> getStudentList();
}
