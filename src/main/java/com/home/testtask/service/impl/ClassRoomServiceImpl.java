package com.home.testtask.service.impl;

import com.home.testtask.entity.ClassRoom;
import com.home.testtask.entity.Student;
import com.home.testtask.entity.Teacher;
import com.home.testtask.repository.ClassRoomRepository;
import com.home.testtask.repository.StudentRepository;
import com.home.testtask.repository.TeacherRepository;
import com.home.testtask.service.ClassRoomService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ClassRoomServiceImpl implements ClassRoomService {

    private final ClassRoomRepository classRoomRepository;
    private final StudentRepository studentRepository;
    private final TeacherRepository teacherRepository;
    @Override
    public List<ClassRoom> getAllClassRoom() {
        return classRoomRepository.findAll();
    }

    @Override
    public List<Student> getStudentFormClassRoom() {

        return null;
    }

    @Override
    public void deleteStudentFromClassRoom(Long id) {
        classRoomRepository.deleteById(id);
    }

    @Override
    public void deleteTeacherFromClassRoom(Long id) {
        classRoomRepository.deleteById(id);
    }

    @Override
    public void addStudentToClassRoom(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void addTeacherToClassRoom(Teacher teacher) {
        teacherRepository.save(teacher);
    }
}
