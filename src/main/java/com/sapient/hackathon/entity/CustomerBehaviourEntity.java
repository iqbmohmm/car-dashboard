package com.sapient.hackathon.entity;


import lombok.Data;

import javax.persistence.*;

@Entity(name = "CustomerBehaviour")
@Data
public class CustomerBehaviourEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="customer_id")
    private String customerId;
    @Column(name="genre_preference")
    private String genrePreference;
    @Column(name="artist_preference")
    private String artistPreference;
    @Column(name="song_preference")
    private String songPreference;
    @Column(name="mood_preference")
    private String moodPreference;
    @Column(name="volume_preference")
    private String volumePreference;
    @Column(name="instrument_preference")
    private String instrumentPreference;
    @Column(name="playlist_preference")
    private String playListPreference;
    @Column(name="device_preference")
    private String devicePreference;
    @Column(name="seat_belt_usage")
    private String seatBeltUsage;
    @Column(name="speeding_incident")
    private String speedingIncident;
    @Column(name="freq_hard_breaking")
    private String freqHardBreaking;
    @Column(name="freq_hard_acceleration")
    private String freqHardAcceleration;
    @Column(name="freq_sudden_changes")
    private String freqSuddenChanges;
    @Column(name="time_of_day")
    private String timeOfDay;
    @Column(name="weather_condition")
    private String weatherCondition;
    @Column(name="distraction_level")
    private String distractionLevel;
    @Column(name="road_type")
    private String roadType;
    @Column(name="average_time_vehicle_maintain")
    private String averageTimeVehicleMaintain;
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
    @Column(name="gear_change")
    private String gearChange;
    @Column(name="lane_change")
    private String laneChange;
    @Column(name="gps_location")
    private String gpsLocation;

}
