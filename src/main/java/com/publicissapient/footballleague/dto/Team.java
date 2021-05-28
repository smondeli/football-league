package com.publicissapient.footballleague.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Team {
    @JsonProperty("team_key")
    private int teamKey;
    @JsonProperty("team_name")
    private String teamName;
    @JsonProperty("team_badge")
    private String teamBadge;
    @JsonProperty("players")
    private List<Player> players;
    @JsonProperty("coaches")
    private List<Coach> coaches;

}
