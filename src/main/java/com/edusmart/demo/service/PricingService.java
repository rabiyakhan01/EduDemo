package com.edusmart.demo.service;

import com.edusmart.demo.entity.Course;
import com.edusmart.demo.entity.Pricingdetail;
import com.edusmart.demo.entity.User;
import com.edusmart.demo.entity.Usercourse;
import com.edusmart.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PricingService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PricingStrategyRepository pricingStrategyRepository;

    @Autowired
    private PricingDetailRepository pricingDetailRepository;

    @Autowired
    private UserCourseRepository userCourseRepository;

    public Pricingdetail getPricingInfo(Long courseID, Long userID) {
        // get the user corresponding to the userid
        User usr = userRepository.findById(userID).get();
        Course course = courseRepository.findById(courseID).get();

        Usercourse usercourse = new Usercourse();
        usercourse = userCourseRepository.findByUserAndCourse(usr, course);
        if (usercourse == null) {
            System.out.println("The selected course is not assigned to the user");
        }
        // fetch pricing info as per location
        List<Pricingdetail> details = pricingDetailRepository.findByCourse(course);
        for (Pricingdetail pd : details) {
            if (pd.getLocation().equalsIgnoreCase(usr.getLocation()))
                return pd;
        }
        return null;
    }


    public List getAllCourses() {
        List Courses = new ArrayList<>();
        courseRepository.findAll().forEach(Courses::add);
        return Courses;
    }

    public List getAllPricingStrategies() {
        List pricingStrategies = new ArrayList<>();
        pricingStrategyRepository.findAll().forEach(pricingStrategies::add);
        return pricingStrategies;
    }

    public List getAllUserCourses() {
        List usercourses = new ArrayList<>();
        userCourseRepository.findAll().forEach(usercourses::add);
        return usercourses;
    }

}
