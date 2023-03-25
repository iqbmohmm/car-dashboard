package com.sapient.hackathon.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name="DrivingData")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class DrivingDataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="customer_id")
    private String customerId;
    @Column(name="speed")
    private String speed;
    @Column(name="acceleration")
    private String acceleration;
    @Column(name="braking")
    private String braking;
    @Column(name="distance")
    private String distance;
    @Column(name="time_spent_driving")
    private String timeSpentDriving;
    @Column(name="fuel_consumption")
    private String fuelConsumption;
    @Column(name="rpm")
    private String rpm;
    @Column(name="gearChange")
    private String gearChange;
    @Column(name="laneChange")
    private String laneChange;
    @Column(name="gpsLocation")
    private String gpsLocation;

}
