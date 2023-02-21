package com.home.testtask.service;

import com.home.testtask.entity.Student;
import com.home.testtask.entity.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeacher();
    Teacher addTeacher(Teacher teacher);
    void deleteTeacher(Long id);
}
