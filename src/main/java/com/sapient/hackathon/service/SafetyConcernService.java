package com.sapient.hackathon.service;

import com.sapient.hackathon.model.SafetyConcernModel;
import com.sapient.hackathon.repository.SafetyConcernRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SafetyConcernService {

    @Autowired
    private ModelMapper modelMap;
    @Autowired
    private SafetyConcernRepository safetyConcernRepository;

    public SafetyConcernModel getById(String id) {
        return modelMap.map(safetyConcernRepository.findByCustomerId(id),SafetyConcernModel.class);
    }

   }
