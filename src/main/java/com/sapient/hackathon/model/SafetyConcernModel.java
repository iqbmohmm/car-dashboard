package com.sapient.hackathon.model;

import lombok.Data;

@Data
public class SafetyConcernModel {

    private String customerId;

    private int seatBeltUsage;

    private int speedingIncident;

    private int freqHardBraking;

    private int freqHardAcceleration;

    private int freqLaneChanges;

    private String weatherCondition;

    private String distractionLevel;

    private String roadType;

    private String avgTimeBetMaintenance;


}
