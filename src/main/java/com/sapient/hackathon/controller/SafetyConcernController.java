package com.sapient.hackathon.controller;

import com.sapient.hackathon.model.SafetyConcernModel;
import com.sapient.hackathon.service.SafetyConcernService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/safetyconcern")
public class SafetyConcernController {

    @Autowired
    SafetyConcernService safetyConcernService;

    @GetMapping("/test")
    public String test() {
        return "test Get mapping";
    }

    @GetMapping("/byId/{customerId}")
    public SafetyConcernModel getById(@PathVariable(value = "customerId") String customerId) {
        return safetyConcernService.getById(customerId);
    }


}
