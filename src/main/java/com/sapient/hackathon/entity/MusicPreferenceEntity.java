package com.sapient.hackathon.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name="MusicPreference")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class MusicPreferenceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="customer_id")
    private String customerId;

    @Column(name="genre_preference")
    private String genrePreference;

    @Column(name = "artist_preference")
    private String artistPreference;

    @Column(name = "song_preference")
    private String songPreference;

    @Column(name = "mood_preference")
    private String moodPreference;

    @Column(name="volume_preference")
    private String volumePreference;

    @Column(name="instrument_preference")
    private String instrumentPreference;

    @Column(name="play_reference")
    private String playPreference;

    @Column(name="radio_preference")
    private String radioPreference;

    @Column(name="device_preference")
    private String devicePreference;

}
