package com.sapient.hackathon.service;

import com.sapient.hackathon.exception.CustomerNotFoundException;
import com.sapient.hackathon.entity.MusicPreferenceEntity;
import com.sapient.hackathon.model.MusicPreferenceModel;
import com.sapient.hackathon.repository.MusicPreferenceRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicPreferenceService {

    @Autowired
    private ModelMapper modelMap;
    @Autowired
    private MusicPreferenceRepository musicPreferenceRepository;

    public MusicPreferenceModel getById(String id) {
        MusicPreferenceEntity byCustomerId = musicPreferenceRepository.findByCustomerId(id);
        if (byCustomerId == null) {
            throw new CustomerNotFoundException(id + " : Customer id not found!");
        }
        return modelMap.map(byCustomerId,MusicPreferenceModel.class);
    }


   }
