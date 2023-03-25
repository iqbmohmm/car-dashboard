package com.sapient.hackathon.utils;

import com.opencsv.CSVReader;
import com.sapient.hackathon.entity.CustomerBehaviourEntity;
import com.sapient.hackathon.entity.DrivingDataEntity;
import com.sapient.hackathon.entity.MusicPreferenceEntity;
import com.sapient.hackathon.entity.PreferredRouteEntity;
import com.sapient.hackathon.entity.SafetyConcernEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class FileUtil {

    public static List<SafetyConcernEntity> extractSafetyFile() throws IOException {
        File file = ResourceUtils.getFile("classpath:data/safetyconcerns.csv");
        CSVReader csvReader = new CSVReader(new FileReader(file));
        List<String[]> readAll = csvReader.readAll();
        List<SafetyConcernEntity> safetyConcernEntities = new ArrayList<>();
        readAll.forEach(it -> {
            safetyConcernEntities.add(SafetyConcernEntity.builder()
                            .customerId(it[0])
                            .seatBeltUsage(it[1])
                            .speedingIncident(it[2])
                            .freqHardBraking(it[3])
                            .freqHardAcceleration(it[4])
                            .freqLaneChanges(it[5])
                            .timeOfDay(it[6])
                            .weatherCondition(it[7])
                            .distractionLevel(it[8])
                            .roadType(it[9])
                            .avgTimeBetMaintenance(it[10])

                    .build());
        });
        return safetyConcernEntities;
    }

    public static List<CustomerBehaviourEntity> extractCustBehaviorFile() throws IOException {
        File file = ResourceUtils.getFile("classpath:data/customer_behavior_updated.csv");
        CSVReader csvReader = new CSVReader(new FileReader(file));
        List<String[]> readAll = csvReader.readAll();
        List<CustomerBehaviourEntity> customerBehaviourEntities = new ArrayList<>();
        readAll.forEach(it -> {
            customerBehaviourEntities.add(CustomerBehaviourEntity.builder()
                            .customerId(it[0])
                            .genrePreference(it[1])
                            .artistPreference(it[2])
                            .songPreference(it[3])
                            .moodPreference(it[4])
                            .volumePreference(it[5])
                            .instrumentPreference(it[6])
                            .playListPreference(it[7])
                            .radioPreference(it[8])
                            .devicePreference(it[9])
                            .seatBeltUsageList(it[10])
                            .speedingIncident(it[11])
                            .freqHardBreaking(it[12])
                            .seatBeltUsage(it[13])
                    .build());
        });
        return customerBehaviourEntities;
    }

    public static List<DrivingDataEntity> extractDrivingFile() throws IOException {
        File file = ResourceUtils.getFile("classpath:data/driving_data.csv");
        CSVReader csvReader = new CSVReader(new FileReader(file));
        List<String[]> readAll = csvReader.readAll();
        List<DrivingDataEntity> drivingDataEntities = new ArrayList<>();
        readAll.forEach(it -> {
            drivingDataEntities.add(DrivingDataEntity.builder()
                            .customerId(it[0])
                            .speed(it[1])
                            .acceleration(it[2])
                            .braking(it[3])
                            .distance(it[4])
                            .timeSpentDriving(it[5])
                            .fuelConsumption(it[6])
                            .rpm(it[7])
                            .gearChange(it[8])
                            .laneChange(it[9])
                            .gpsLocation(it[10])
                    .build());
        });
        return drivingDataEntities;
    }

    public static List<MusicPreferenceEntity> extractMusicFile() throws IOException {
        File file = ResourceUtils.getFile("classpath:data/musicpreferences.csv");
        CSVReader csvReader = new CSVReader(new FileReader(file));
        List<String[]> readAll = csvReader.readAll();
        List<MusicPreferenceEntity> musicPreferenceEntities = new ArrayList<>();
        readAll.forEach(it -> {
            musicPreferenceEntities.add(MusicPreferenceEntity.builder()
                            .customerId(it[0])
                            .genrePreference(it[1])
                            .artistPreference(it[2])
                            .songPreference(it[3])
                            .moodPreference(it[4])
                            .volumePreference(it[5])
                            .instrumentPreference(it[6])
                            .playPreference(it[7])
                            .radioPreference(it[8])
                            .devicePreference(it[9])
                    .build());
        });
        return musicPreferenceEntities;
    }

    public static List<PreferredRouteEntity> extractRouteFile() throws IOException {
        File file = ResourceUtils.getFile("classpath:data/preferredroutes.csv");
        CSVReader csvReader = new CSVReader(new FileReader(file));
        List<String[]> readAll = csvReader.readAll();
        List<PreferredRouteEntity> preferredRouteEntities = new ArrayList<>();
        readAll.forEach(it -> {
            preferredRouteEntities.add(PreferredRouteEntity.builder()
                    .customerId(it[0])
                    .startingLocation(it[1])
                    .endingLocation(it[2])
                    .routeTaken(it[3])
                    .distance(it[4])
                    .timeTaken(it[5])
                    .trafficCondition(it[6])
                    .preferredTime(it[7])
                    .modeOfTransportation(it[8])
                    .weatherCondition(it[9])
                    .pointOfInterest(it[10])

                    .build());
        });
        return preferredRouteEntities;
    }

    public static List<SafetyConcernEntity> extractServiceFile() throws IOException {
        File file = ResourceUtils.getFile("classpath:data/services.csv");
        CSVReader csvReader = new CSVReader(new FileReader(file));
        List<String[]> readAll = csvReader.readAll();
        List<SafetyConcernEntity> safetyConcernEntities = new ArrayList<>();
        readAll.forEach(it -> {
            safetyConcernEntities.add(SafetyConcernEntity.builder()
                    .customerId(it[0])
                    .seatBeltUsage(it[1])
                    .speedingIncident(it[2])
                    .freqHardBraking(it[3])
                    .freqHardAcceleration(it[4])
                    .freqLaneChanges(it[5])
                    .timeOfDay(it[6])
                    .weatherCondition(it[7])
                    .distractionLevel(it[8])
                    .roadType(it[9])
                    .avgTimeBetMaintenance(it[10])

                    .build());
        });
        return safetyConcernEntities;
    }

    public static List<SafetyConcernEntity> extractAccessoriesFile() throws IOException {
        File file = ResourceUtils.getFile("classpath:data/caraccessories.csv");
        CSVReader csvReader = new CSVReader(new FileReader(file));
        List<String[]> readAll = csvReader.readAll();
        List<SafetyConcernEntity> safetyConcernEntities = new ArrayList<>();
        readAll.forEach(it -> {
            safetyConcernEntities.add(SafetyConcernEntity.builder()
                    .customerId(it[0])
                    .seatBeltUsage(it[1])
                    .speedingIncident(it[2])
                    .freqHardBraking(it[3])
                    .freqHardAcceleration(it[4])
                    .freqLaneChanges(it[5])
                    .timeOfDay(it[6])
                    .weatherCondition(it[7])
                    .distractionLevel(it[8])
                    .roadType(it[9])
                    .avgTimeBetMaintenance(it[10])

                    .build());
        });
        return safetyConcernEntities;
    }
}
