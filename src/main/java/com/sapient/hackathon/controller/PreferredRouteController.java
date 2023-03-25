package com.sapient.hackathon.controller;

import com.sapient.hackathon.model.PreferredRouteModel;
import com.sapient.hackathon.service.PreferredRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/preferredroute")
public class PreferredRouteController {

    @Autowired
    PreferredRouteService preferredRouteService;

    @GetMapping("/test")
    public String test() {
        return "test Get mapping";
    }

    @GetMapping("/byId/{customerId}")
    public PreferredRouteModel getById(@PathVariable(value = "customerId") String customerId) {
        return preferredRouteService.getById(customerId);
    }

}
