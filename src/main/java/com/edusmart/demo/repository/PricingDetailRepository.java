package com.edusmart.demo.repository;

import com.edusmart.demo.entity.Course;
import com.edusmart.demo.entity.Pricingdetail;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PricingDetailRepository extends CrudRepository<Pricingdetail, Long> {
    List<Pricingdetail> findByCourse(Course course);
}
