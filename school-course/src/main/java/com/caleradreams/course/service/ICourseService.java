package com.caleradreams.course.service;

import com.caleradreams.course.entities.Course;
import com.caleradreams.course.http.response.StudentByCourseResponse;

import java.util.List;

public interface ICourseService {

    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);

    StudentByCourseResponse findStudentByIdCourse(Long idCourse);
}
