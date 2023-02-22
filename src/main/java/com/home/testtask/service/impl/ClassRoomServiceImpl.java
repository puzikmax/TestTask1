package com.home.testtask.service.impl;

import com.home.testtask.entity.ClassRoom;
import com.home.testtask.entity.Student;
import com.home.testtask.entity.Teacher;
import com.home.testtask.repository.ClassRoomRepository;
import com.home.testtask.service.ClassRoomService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ClassRoomServiceImpl implements ClassRoomService {

    private final ClassRoomRepository classRoomRepository;
    @Override
    public List<ClassRoom> getAllClassRoom() {
        return null;
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
    public ClassRoom addStudentToClassRoom(Student student) {
        return null;
    }

    @Override
    public ClassRoom addTeacherToClassRoom(Teacher teacher) {

        return null;
    }
}
