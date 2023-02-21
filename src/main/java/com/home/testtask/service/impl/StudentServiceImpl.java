package com.home.testtask.service.impl;

import com.home.testtask.entity.Student;
import com.home.testtask.repository.StudentRepository;
import com.home.testtask.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository;

    @Override
    public List<Student> sortStudentByName(List<Student> studentList) {
        return null;
    }

    @Override
    public List<Student> sortStudentBySurname(List<Student> studentList) {
        return null;
    }

    @Override
    public List<Student> sortStudentByDateOfBirghtday(List<Student> studentList) {
        return null;
    }

    @Override
    public List<Student> getStudentList() {
        return studentRepository.findAll();
    }
}
