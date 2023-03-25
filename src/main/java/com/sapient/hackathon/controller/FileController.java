package com.sapient.hackathon.controller;

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
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
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
        safetyConcernEntities.parallelStream()
                .forEach(safetyConcernEntity ->
                        safetyConcernRepository.saveAndFlush(safetyConcernEntity));
        return "Safety done!";
    }

    @PostMapping("/cust_behavior")
    public String uploadCustBehaviorFile() throws IOException {
        List<CustomerBehaviourEntity> customerBehaviourEntities = FileUtil.extractCustBehaviorFile();
        customerBehaviourEntities.parallelStream()
                .forEach(safetyConcernEntity ->
                        customerBehaviourRepository.saveAndFlush(safetyConcernEntity));
        return "Customer behavior done!";
    }

    @PostMapping("/music")
    public String uploadMusicFile() throws IOException {
        List<MusicPreferenceEntity> musicPreferenceEntities = FileUtil.extractMusicFile();
        musicPreferenceEntities.parallelStream()
                .forEach(musicPreferenceEntity ->
                        musicPreferenceRepository.saveAndFlush(musicPreferenceEntity));
        return "Music done!";
    }

    @PostMapping("/driving")
    public String uploadDrivingFile() throws IOException {
        List<DrivingDataEntity> drivingDataEntities = FileUtil.extractDrivingFile();
        drivingDataEntities.parallelStream()
                .forEach(drivingDataEntity ->
                        drivingDataRepository.saveAndFlush(drivingDataEntity));
        return "Driving data done!";
    }

    @PostMapping("/route")
    public String uploadRouteFile() throws IOException {
        List<PreferredRouteEntity> preferredRouteEntities = FileUtil.extractRouteFile();
        preferredRouteEntities.parallelStream()
                .forEach(preferredRouteEntity ->
                        preferredRouteRepository.saveAndFlush(preferredRouteEntity));
        return "Route done!";
    }

}
