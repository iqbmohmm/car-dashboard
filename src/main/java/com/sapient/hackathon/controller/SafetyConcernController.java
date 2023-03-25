package com.sapient.hackathon.controller;

import com.sapient.hackathon.entity.BaseEntity;
import com.sapient.hackathon.entity.SafetyConcernEntity;
import com.sapient.hackathon.service.BaseService;
import com.sapient.hackathon.service.SafetyConcernService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/safetyconcern")
public class SafetyConcernController {

    @Autowired
    SafetyConcernService safetyConcernService;

    @CrossOrigin
    @GetMapping("/test")
    public String test() {
        return "test Get mapping";
    }

    @CrossOrigin
    @GetMapping("/byId/{customerId}")
    public SafetyConcernEntity getById(@PathVariable(value = "customerId") String customerId) {
        return safetyConcernService.getById(customerId);
    }

    @CrossOrigin
    @GetMapping("/getAll")
    public List<SafetyConcernEntity> getAll() {
        return safetyConcernService.getAll();
    }

    @CrossOrigin
    @PostMapping
    public SafetyConcernEntity create(@RequestBody SafetyConcernEntity baseEntity) {
        return safetyConcernService.create(baseEntity);
    }

    @CrossOrigin
    @PutMapping
    public SafetyConcernEntity update(@RequestBody SafetyConcernEntity baseEntity) {
        return safetyConcernService.update(baseEntity);
    }


}
