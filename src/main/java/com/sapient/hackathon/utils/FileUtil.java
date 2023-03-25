package com.sapient.hackathon.utils;

import com.opencsv.CSVReader;
import com.sapient.hackathon.enums.FileType;
import com.sapient.hackathon.entity.SafetyConcernEntity;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    private static final String filePath = "C:\\Users\\iqbmohmm\\Downloads\\safetyconcerns.csv";

    public static List<SafetyConcernEntity> extractFile(FileType fileType) throws IOException {
        CSVReader csvReader = new CSVReader(new FileReader(filePath));
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
