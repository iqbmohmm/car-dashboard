package com.sapient.hackathon.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "PreferredRoute")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class PreferredRouteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="customer_id")
    private String customerId;
    @Column(name="starting_location")
    private String startingLocation;
    @Column(name="ending_location")
    private String endingLocation;
    @Column(name="route_taken")
    private String routeTaken;
    @Column(name="distance")
    private String distance;
    @Column(name="time_taken")
    private String timeTaken;
    @Column(name="traffic_condition")
    private String trafficCondition;
    @Column(name="preferred_time")
    private String preferredTime;
    @Column(name="mode_of_transportation")
    private String modeOfTransportation;
    @Column(name="weather_condition")
    private String weatherCondition;
    @Column(name="point_of_interest")
    private String pointOfInterest;

}
