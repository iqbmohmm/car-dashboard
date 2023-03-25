package com.sapient.hackathon.controller;

import com.sapient.hackathon.model.MusicPreferenceModel;
import com.sapient.hackathon.service.MusicPreferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/musicPreference")
public class MusicPreferenceController {

    @Autowired
    MusicPreferenceService musicPreferenceService;

    @GetMapping("/test")
    public String test() {
        return "test Get mapping";
    }

    @GetMapping("/byId/{customerId}")
    public MusicPreferenceModel getById(@PathVariable(value = "customerId") String customerId) {
        return musicPreferenceService.getById(customerId);
    }

}
