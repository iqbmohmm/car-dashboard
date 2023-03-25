package com.sapient.hackathon.controller;

import com.sapient.hackathon.model.CustomerBehaviourModel;
import com.sapient.hackathon.service.CustomerBehaviourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customerBehaviour")
public class CustomerBehaviourController {

    @Autowired
    CustomerBehaviourService customerBehaviourService;

    @GetMapping("/test")
    public String test() {
        return "test Get mapping";
    }

    @GetMapping("/byId/{customerId}")
    public CustomerBehaviourModel getById(@PathVariable(value = "customerId") String customerId) {
        return customerBehaviourService.getById(customerId);
    }

}
