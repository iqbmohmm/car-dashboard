package com.sapient.hackathon.service;

import com.sapient.hackathon.model.PreferredRouteModel;
import com.sapient.hackathon.repository.PreferredRouteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreferredRouteService {

    @Autowired
    private ModelMapper modelMap;
    @Autowired
    private PreferredRouteRepository preferredRouteRepository;

    public PreferredRouteModel getById(String id) {
        return modelMap.map(preferredRouteRepository.findByCustomerId(id),PreferredRouteModel.class);
    }
}
