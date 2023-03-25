package com.sapient.hackathon.controller;

import com.sapient.hackathon.entity.SafetyConcernEntity;
import com.sapient.hackathon.service.SafetyConcernService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public SafetyConcernEntity getById(@PathVariable(value = "customerId") String customerId) {
        return safetyConcernService.getById(customerId);
    }

    @GetMapping("/getAll")
    public List<SafetyConcernEntity> getAll() {
        return safetyConcernService.getAll();
    }

    @PostMapping
    public SafetyConcernEntity create(@RequestBody SafetyConcernEntity baseEntity) {
        return safetyConcernService.create(baseEntity);
    }

    @PutMapping
    public SafetyConcernEntity update(@RequestBody SafetyConcernEntity baseEntity) {
        return safetyConcernService.update(baseEntity);
    }


}
