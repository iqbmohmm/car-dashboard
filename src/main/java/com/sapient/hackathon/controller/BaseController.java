package com.sapient.hackathon.controller;

import com.sapient.hackathon.entity.BaseEntity;
import com.sapient.hackathon.service.BaseService;
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
@RequestMapping("/base")
public class BaseController {

    @Autowired
    BaseService baseService;

    @GetMapping("/test")
    public String test() {
        return "test Get mapping";
    }

    @GetMapping("/byId/{id}")
    public BaseEntity getById(@PathVariable(value = "id") Long id) {
        return baseService.getById(id);
    }

    @GetMapping("getAll")
    public List<BaseEntity> getAll() {
        return baseService.getAll();
    }

    @PostMapping
    public BaseEntity create(@RequestBody BaseEntity baseEntity) {
        return baseService.create(baseEntity);
    }

    @PutMapping
    public BaseEntity update(@RequestBody BaseEntity baseEntity) {
        return baseService.update(baseEntity);
    }


}
