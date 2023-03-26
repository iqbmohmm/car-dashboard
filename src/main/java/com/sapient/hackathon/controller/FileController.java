package com.sapient.hackathon.controller;

import com.google.common.collect.Lists;
import com.sapient.hackathon.entity.CustomerBehaviourEntity;
import com.sapient.hackathon.entity.DrivingDataEntity;
import com.sapient.hackathon.entity.MusicPreferenceEntity;
import com.sapient.hackathon.entity.PreferredRouteEntity;
import com.sapient.hackathon.entity.SafetyConcernEntity;
import com.sapient.hackathon.repository.CustomerBehaviourRepository;
import com.sapient.hackathon.repository.DrivingDataRepository;
import com.sapient.hackathon.repository.MusicPreferenceRepository;
import com.sapient.hackathon.repository.PreferredRouteRepository;
import com.sapient.hackathon.repository.SafetyConcernRepository;
import com.sapient.hackathon.utils.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    SafetyConcernRepository safetyConcernRepository;

    @Autowired
    CustomerBehaviourRepository customerBehaviourRepository;

    @Autowired
    MusicPreferenceRepository musicPreferenceRepository;

    @Autowired
    PreferredRouteRepository preferredRouteRepository;

    @Autowired
    DrivingDataRepository drivingDataRepository;

    @PostMapping("/safety")
    public String uploadSafetyFile() throws IOException {
        List<SafetyConcernEntity> safetyConcernEntities = FileUtil.extractSafetyFile();
        List<List<SafetyConcernEntity>> partition = Lists.partition(safetyConcernEntities, 10);
        partition.forEach(it -> {
            safetyConcernRepository.saveAllAndFlush(it);
        });
        return "Safety done!";
    }

    @PostMapping("/cust_behavior")
    public String uploadCustBehaviorFile() throws IOException {
        List<CustomerBehaviourEntity> customerBehaviourEntities = FileUtil.extractCustBehaviorFile();
        List<List<CustomerBehaviourEntity>> partition = Lists.partition(customerBehaviourEntities, 10);
        partition.forEach(it -> {
            customerBehaviourRepository.saveAllAndFlush(it);
        });
        return "Customer behavior done!";
    }

    @PostMapping("/music")
    public String uploadMusicFile() throws IOException {
        List<MusicPreferenceEntity> musicPreferenceEntities = FileUtil.extractMusicFile();
        List<List<MusicPreferenceEntity>> partition = Lists.partition(musicPreferenceEntities, 10);
        partition.forEach(it -> {
            musicPreferenceRepository.saveAllAndFlush(it);
        });
        return "Music done!";
    }

    @PostMapping("/driving")
    public String uploadDrivingFile() throws IOException {
        List<DrivingDataEntity> drivingDataEntities = FileUtil.extractDrivingFile();
        List<List<DrivingDataEntity>> partition = Lists.partition(drivingDataEntities, 10);
        partition.forEach(it -> {
            drivingDataRepository.saveAllAndFlush(it);
        });
        return "Driving data done!";
    }

    @PostMapping("/route")
    public String uploadRouteFile() throws IOException {
        List<PreferredRouteEntity> preferredRouteEntities = FileUtil.extractRouteFile();
        List<List<PreferredRouteEntity>> partition = Lists.partition(preferredRouteEntities, 10);
        partition.forEach(it -> {
            preferredRouteRepository.saveAllAndFlush(it);
        });
        return "Route done!";
    }

}
