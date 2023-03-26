package com.sapient.hackathon.model;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class MusicPreferenceModel {

    private String customerId;

    private String genrePreference;

    private List<String> artistPreference;

    private List<String> songPreference;

    private String moodPreference;

    private String volumePreference;

    private String instrumentPreference;

    private List<String> playPreference;

    private String radioPreference;

    private String devicePreference;

    public void setSongPreference(String songPreference) {
        this.songPreference = Arrays.asList(splitStringAsArray(songPreference));
    }

    public void setArtistPreference(String artistPreference) {
        this.artistPreference = Arrays.asList(splitStringAsArray(artistPreference));
    }

    public void setPlayPreference(String playPreference) {
        this.playPreference = Arrays.asList(splitStringAsArray(playPreference));
    }

    private String[] splitStringAsArray(String value) {
        return value.replaceAll("^\\[|\\]$", "").replace("'", "").replace(" ", "").split(",");
    }
}
