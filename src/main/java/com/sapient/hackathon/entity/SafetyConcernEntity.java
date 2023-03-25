package com.sapient.hackathon.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "SafetyConcern")
@Data
public class SafetyConcernEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="customer_id")
    private String customerId;

    @Column(name="seat_belt_usage")
    private int seatBeltUsage;

    @Column(name="speeding_incident")
    private int speedingIncident;

    @Column(name="freq_hard_braking")
    private int freqHardBraking;

    @Column(name="freq_hard_acceleration")
    private int freqHardAcceleration;

    @Column(name="freq_lane_changes")
    private int freqLaneChanges;

    @Column(name="weather_condition")
    private String weatherCondition;

    @Column(name="distraction_level")
    private String distractionLevel;

    @Column(name="road_type")
    private String roadType;


}
