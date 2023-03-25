package com.sapient.hackathon.entity;

import lombok.*;

import javax.persistence.*;

@Entity(name = "SafetyConcern")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class SafetyConcernEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="customer_id",unique = true,nullable = false)
    private String customerId;

    @Column(name="seat_belt_usage")
    private String seatBeltUsage;

    @Column(name="speeding_incident")
    private String speedingIncident;

    @Column(name="freq_hard_braking")
    private String freqHardBraking;

    @Column(name="freq_hard_acceleration")
    private String freqHardAcceleration;

    @Column(name="freq_lane_changes")
    private String freqLaneChanges;

    @Column(name="time_of_day")
    private String timeOfDay;

    @Column(name="weather_condition")
    private String weatherCondition;

    @Column(name="distraction_level")
    private String distractionLevel;

    @Column(name="road_type")
    private String roadType;

    @Column(name="avg_time_bet_maintenance")
    private String avgTimeBetMaintenance;


}
