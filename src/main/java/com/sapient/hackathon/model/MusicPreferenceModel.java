package com.sapient.hackathon.model;

import lombok.Data;

@Data
public class MusicPreferenceModel {

    private String customerId;

    private String genrePreference;

    private String artistPreference;

    private String songPreference;

    private String moodPreference;

    private String volumePreference;

    private String instrumentPreference;

    private String playPreference;

    private String radioPreference;

    private String devicePreference;

}
