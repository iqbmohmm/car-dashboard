package com.sapient.hackathon.service;

import com.sapient.hackathon.model.CustomerBehaviourModel;
import com.sapient.hackathon.repository.CustomerBehaviourRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerBehaviourService {

    @Autowired
    private ModelMapper modelMap;
    @Autowired
    private CustomerBehaviourRepository customerBehaviourRepository;

    public CustomerBehaviourModel getById(String id) {
        return modelMap.map(customerBehaviourRepository.findByCustomerId(id),CustomerBehaviourModel.class);
    }


   }
