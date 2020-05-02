package com.edusmart.demo.repository;

import com.edusmart.demo.entity.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {

}
