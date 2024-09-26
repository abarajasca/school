package com.caleradreams.course.persistence;

import com.caleradreams.course.entities.Course;
import org.springframework.data.repository.CrudRepository;

public interface ICourseRepository extends CrudRepository<Course,Long> {
}
