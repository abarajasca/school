package com.caleradreams.student.service;

import com.caleradreams.student.entities.Student;

import java.util.List;

public interface IStudentService {

    List<Student> findAll();

    Student findById(Long id);

    void save(Student student);
    List<Student> findByIdCourse(Long idCourse);
}
