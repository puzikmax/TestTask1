package com.home.testtask.service.impl;

import com.home.testtask.entity.Teacher;
import com.home.testtask.repository.TeacherRepository;
import com.home.testtask.service.TeacherService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class TeacherServiceImpl implements TeacherService {
    private final TeacherRepository teacherRepository;
    @Override
    public List<Teacher> getAllTeacher() {
        return teacherRepository.findAll();
    }
}
