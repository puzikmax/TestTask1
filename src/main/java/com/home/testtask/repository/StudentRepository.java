package com.home.testtask.repository;

import com.home.testtask.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query ("select id from Student")
    List<Student> getStudentById(Long id);
}