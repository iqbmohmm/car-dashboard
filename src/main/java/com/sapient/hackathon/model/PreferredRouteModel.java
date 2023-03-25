package com.sapient.hackathon.model;

import lombok.Data;

@Data
public class PreferredRouteModel {

    private String customerId;
    private String startingLocation;
    private String endingLocation;
    private String routeTaken;
    private String distance;
    private String timeTaken;
    private String trafficCondition;
    private String preferredTime;
    private String modeOfTransportation;
    private String weatherCondition;
    private String pointOfInterest;

}
