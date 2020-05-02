package com.edusmart.demo.controller;

import com.edusmart.demo.entity.Pricingdetail;
import com.edusmart.demo.entity.Pricingstrategy;
import com.edusmart.demo.service.PricingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PricingController {

    @Autowired
    private PricingService pricingService;

    @GetMapping("/pricing/{courseID}/{userID}")
    public Pricingdetail getPricingInformation(@PathVariable Long courseID, @PathVariable Long userID) {
        return pricingService.getPricingInfo(courseID, userID);
    }

    @GetMapping("/pricingStrategy")
    public List<Pricingstrategy> getPricingStrategy() {
        List<Pricingstrategy> pricingstrategies = pricingService.getAllPricingStrategies();
        return pricingstrategies;
    }

    @GetMapping("/courses")
    public List getAllCourses() {
        return pricingService.getAllCourses();
    }

    @GetMapping("/usercourses")
    public List getAllUserCourses() {
        return pricingService.getAllUserCourses();
    }

}
