package com.sapient.hackathon.service;

import com.sapient.hackathon.model.DrivingDataModel;
import com.sapient.hackathon.repository.DrivingDataRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrivingDataService {

    @Autowired
    private ModelMapper modelMap;
    @Autowired
    private DrivingDataRepository drivingDataRepository;

    public DrivingDataModel getById(String id) {
        return modelMap.map(drivingDataRepository.findByCustomerId(id),DrivingDataModel.class);
    }


   }
