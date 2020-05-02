package com.edusmart.demo.repository;

import com.edusmart.demo.entity.Course;
import com.edusmart.demo.entity.User;
import com.edusmart.demo.entity.Usercourse;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserCourseRepository extends CrudRepository<Usercourse, Long> {

    List<Usercourse> findByUser(User usr);

    Usercourse findByUserAndCourse(User usr, Course course);
}

