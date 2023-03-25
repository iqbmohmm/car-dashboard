package com.sapient.hackathon.model;

import lombok.Data;

@Data
public class DrivingDataModel {

    private String customerId;
    private String speed;
    private String acceleration;
    private String braking;
    private String distance;
    private String timeSpentDriving;
    private String fuelConsumption;
    private String rpm;
    private String gearChange;
    private String laneChange;
    private String gpsLocation;

}
