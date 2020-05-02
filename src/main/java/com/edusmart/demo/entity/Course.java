package com.edusmart.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String coursename;
    private String pricingstrategy;

    public Course() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String courseName) {
        this.coursename = courseName;
    }

    public String getPricingstrategy() {
        return pricingstrategy;
    }

    public void setPricingstrategy(String pricingstrategy) {
        this.pricingstrategy = pricingstrategy;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + coursename + '\'' +
                ", pricingstrategy='" + pricingstrategy + '\'' +
                '}';
    }
}
