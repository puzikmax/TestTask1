package com.home.testtask.service;

import com.home.testtask.entity.ClassRoom;
import com.home.testtask.entity.Student;
import com.home.testtask.entity.Teacher;

import java.util.List;

public interface ClassRoomService {
    List<ClassRoom> getAllClassRoom();
    List<Student> getStudentFormClassRoom();

    void deleteStudentFromClassRoom(Long id);
    void deleteTeacherFromClassRoom(Long id);

    ClassRoom addStudentToClassRoom(Student student);
    ClassRoom addTeacherToClassRoom(Teacher teacher);
}
