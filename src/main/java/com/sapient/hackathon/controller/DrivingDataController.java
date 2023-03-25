package com.sapient.hackathon.controller;

import com.sapient.hackathon.model.DrivingDataModel;
import com.sapient.hackathon.service.DrivingDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drivingData")
public class DrivingDataController {

    @Autowired
    DrivingDataService drivingDataService;

    @GetMapping("/test")
    public String test() {
        return "test Get mapping";
    }

    @GetMapping("/byId/{customerId}")
    public DrivingDataModel getById(@PathVariable(value = "customerId") String customerId) {
        return drivingDataService.getById(customerId);
    }

}
