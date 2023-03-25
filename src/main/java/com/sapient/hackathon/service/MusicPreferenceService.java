package com.sapient.hackathon.service;

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
        return modelMap.map(musicPreferenceRepository.findByCustomerId(id),MusicPreferenceModel.class);
    }


   }
