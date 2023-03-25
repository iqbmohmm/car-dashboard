package com.sapient.hackathon.model;

import lombok.Data;


@Data
public class CustomerBehaviourModel {

    private String customerId;
    private String genrePreference;
    private String artistPreference;
    private String songPreference;
    private String moodPreference;
    private String volumePreference;
    private String instrumentPreference;
    private String playListPreference;
    private String devicePreference;
    private String seatBeltUsageList;
    private String seatBeltUsage;
    private String speedingIncident;
    private String freqHardBreaking;
    private String freqHardAcceleration;
    private String freqSuddenChanges;
    private String timeOfDay;
    private String weatherCondition;
    private String distractionLevel;
    private String roadType;
    private String averageTimeVehicleMaintain;
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
