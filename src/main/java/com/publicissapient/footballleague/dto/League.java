package com.publicissapient.footballleague.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class League extends Country{
    @JsonProperty("league_id")
    private int leagueId;
    @JsonProperty("league_name")
    private String leagueName;
    @JsonProperty("league_season")
    private String leagueSeason;
    @JsonProperty("league_logo")
    private String leagueLogo;

    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueSeason() {
        return leagueSeason;
    }

    public void setLeagueSeason(String leagueSeason) {
        this.leagueSeason = leagueSeason;
    }

    public String getLeagueLogo() {
        return leagueLogo;
    }

    public void setLeagueLogo(String leagueLogo) {
        this.leagueLogo = leagueLogo;
    }
}
