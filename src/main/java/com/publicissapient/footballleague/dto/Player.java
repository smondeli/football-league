package com.publicissapient.footballleague.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Player {
    @JsonProperty("player_key")
    private long playerKey;
    @JsonProperty("player_id")
    private long playerId;
    @JsonProperty("player_name")
    private String playerName;
    @JsonProperty("player_number")
    private int playerNumber;
    @JsonProperty("player_country")
    private String playerCountry;
    @JsonProperty("player_type")
    private String playerType;
    @JsonProperty("player_age")
    private int playerAge;
    @JsonProperty("player_match_played")
    private int playerMatchPlayed;
    @JsonProperty("player_goals")
    private int playerGoals;
    @JsonProperty("player_yellow_cards")
    private int playerYellowCards;
    @JsonProperty("player_red_cards")
    private int playerRedCards;
    @JsonProperty("player_injured")
    private String playerInjured;
    @JsonProperty("player_substitute_out")
    private int playerSubstituteOut;
    @JsonProperty("player_substitutes_on_bench")
    private int playerSubstitutesOnBench;
    @JsonProperty("player_assists")
    private int playerAssists;
    @JsonProperty("player_is_captain")
    private int playerIsCaptain;
    @JsonProperty("player_shots_total")
    private int playerShotsTotal;
    @JsonProperty("player_goals_conceded")
    private int playerGoalsConceded;
    @JsonProperty("player_fouls_committed")
    private int playerFoulsCommitted;
    @JsonProperty("player_tackles")
    private int playerTackles;
    @JsonProperty("player_blocks")
    private int playerBlocks;
    @JsonProperty("player_crosses_total")
    private int playerCrossesTotal;
    @JsonProperty("player_interceptions")
    private int playerInterceptions;
    @JsonProperty("player_clearances")
    private int playerClearances;
    @JsonProperty("player_dispossesed")
    private int playerDispossesed;
    @JsonProperty("player_saves")
    private int playerSaves;
    @JsonProperty("player_inside_box_saves")
    private int playerInsideBoxSaves;
    @JsonProperty("player_duels_total")
    private int playerDuelsTotal;
    @JsonProperty("player_duels_won")
    private int playerSuelsWon;
    @JsonProperty("player_dribble_attempts")
    private int playerDribbleAttempts;
    @JsonProperty("player_dribble_succ")
    private int playerDribbleSucc;
    @JsonProperty("player_pen_comm")
    private int playerPenComm;
    @JsonProperty("player_pen_won")
    private int playerPenWon;
    @JsonProperty("player_pen_scored")
    private int playerPenScored;
    @JsonProperty("player_pen_missed")
    private int playerPenMissed;
    @JsonProperty("player_passes")
    private int playerPasses;
    @JsonProperty("player_passes_accuracy")
    private int playerPassesAccuracy;
    @JsonProperty("player_key_passes")
    private int playerkeyPasses;
    @JsonProperty("player_woordworks")
    private int playerWoordworks;
    @JsonProperty("player_rating")
    private float playerRating;

    public long getPlayerKey() {
        return playerKey;
    }

    public void setPlayerKey(long playerKey) {
        this.playerKey = playerKey;
    }

    public long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(long playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getPlayerCountry() {
        return playerCountry;
    }

    public void setPlayerCountry(String playerCountry) {
        this.playerCountry = playerCountry;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public int getPlayerAge() {
        return playerAge;
    }

    public void setPlayerAge(int playerAge) {
        this.playerAge = playerAge;
    }

    public int getPlayerMatchPlayed() {
        return playerMatchPlayed;
    }

    public void setPlayerMatchPlayed(int playerMatchPlayed) {
        this.playerMatchPlayed = playerMatchPlayed;
    }

    public int getPlayerGoals() {
        return playerGoals;
    }

    public void setPlayerGoals(int playerGoals) {
        this.playerGoals = playerGoals;
    }

    public int getPlayerYellowCards() {
        return playerYellowCards;
    }

    public void setPlayerYellowCards(int playerYellowCards) {
        this.playerYellowCards = playerYellowCards;
    }

    public int getPlayerRedCards() {
        return playerRedCards;
    }

    public void setPlayerRedCards(int playerRedCards) {
        this.playerRedCards = playerRedCards;
    }

    public String getPlayerInjured() {
        return playerInjured;
    }

    public void setPlayerInjured(String playerInjured) {
        this.playerInjured = playerInjured;
    }

    public int getPlayerSubstituteOut() {
        return playerSubstituteOut;
    }

    public void setPlayerSubstituteOut(int playerSubstituteOut) {
        this.playerSubstituteOut = playerSubstituteOut;
    }

    public int getPlayerSubstitutesOnBench() {
        return playerSubstitutesOnBench;
    }

    public void setPlayerSubstitutesOnBench(int playerSubstitutesOnBench) {
        this.playerSubstitutesOnBench = playerSubstitutesOnBench;
    }

    public int getPlayerAssists() {
        return playerAssists;
    }

    public void setPlayerAssists(int playerAssists) {
        this.playerAssists = playerAssists;
    }

    public int getPlayerIsCaptain() {
        return playerIsCaptain;
    }

    public void setPlayerIsCaptain(int playerIsCaptain) {
        this.playerIsCaptain = playerIsCaptain;
    }

    public int getPlayerShotsTotal() {
        return playerShotsTotal;
    }

    public void setPlayerShotsTotal(int playerShotsTotal) {
        this.playerShotsTotal = playerShotsTotal;
    }

    public int getPlayerGoalsConceded() {
        return playerGoalsConceded;
    }

    public void setPlayerGoalsConceded(int playerGoalsConceded) {
        this.playerGoalsConceded = playerGoalsConceded;
    }

    public int getPlayerFoulsCommitted() {
        return playerFoulsCommitted;
    }

    public void setPlayerFoulsCommitted(int playerFoulsCommitted) {
        this.playerFoulsCommitted = playerFoulsCommitted;
    }

    public int getPlayerTackles() {
        return playerTackles;
    }

    public void setPlayerTackles(int playerTackles) {
        this.playerTackles = playerTackles;
    }

    public int getPlayerBlocks() {
        return playerBlocks;
    }

    public void setPlayerBlocks(int playerBlocks) {
        this.playerBlocks = playerBlocks;
    }

    public int getPlayerCrossesTotal() {
        return playerCrossesTotal;
    }

    public void setPlayerCrossesTotal(int playerCrossesTotal) {
        this.playerCrossesTotal = playerCrossesTotal;
    }

    public int getPlayerInterceptions() {
        return playerInterceptions;
    }

    public void setPlayerInterceptions(int playerInterceptions) {
        this.playerInterceptions = playerInterceptions;
    }

    public int getPlayerClearances() {
        return playerClearances;
    }

    public void setPlayerClearances(int playerClearances) {
        this.playerClearances = playerClearances;
    }

    public int getPlayerDispossesed() {
        return playerDispossesed;
    }

    public void setPlayerDispossesed(int playerDispossesed) {
        this.playerDispossesed = playerDispossesed;
    }

    public int getPlayerSaves() {
        return playerSaves;
    }

    public void setPlayerSaves(int playerSaves) {
        this.playerSaves = playerSaves;
    }

    public int getPlayerInsideBoxSaves() {
        return playerInsideBoxSaves;
    }

    public void setPlayerInsideBoxSaves(int playerInsideBoxSaves) {
        this.playerInsideBoxSaves = playerInsideBoxSaves;
    }

    public int getPlayerDuelsTotal() {
        return playerDuelsTotal;
    }

    public void setPlayerDuelsTotal(int playerDuelsTotal) {
        this.playerDuelsTotal = playerDuelsTotal;
    }

    public int getPlayerSuelsWon() {
        return playerSuelsWon;
    }

    public void setPlayerSuelsWon(int playerSuelsWon) {
        this.playerSuelsWon = playerSuelsWon;
    }

    public int getPlayerDribbleAttempts() {
        return playerDribbleAttempts;
    }

    public void setPlayerDribbleAttempts(int playerDribbleAttempts) {
        this.playerDribbleAttempts = playerDribbleAttempts;
    }

    public int getPlayerDribbleSucc() {
        return playerDribbleSucc;
    }

    public void setPlayerDribbleSucc(int playerDribbleSucc) {
        this.playerDribbleSucc = playerDribbleSucc;
    }

    public int getPlayerPenComm() {
        return playerPenComm;
    }

    public void setPlayerPenComm(int playerPenComm) {
        this.playerPenComm = playerPenComm;
    }

    public int getPlayerPenWon() {
        return playerPenWon;
    }

    public void setPlayerPenWon(int playerPenWon) {
        this.playerPenWon = playerPenWon;
    }

    public int getPlayerPenScored() {
        return playerPenScored;
    }

    public void setPlayerPenScored(int playerPenScored) {
        this.playerPenScored = playerPenScored;
    }

    public int getPlayerPenMissed() {
        return playerPenMissed;
    }

    public void setPlayerPenMissed(int playerPenMissed) {
        this.playerPenMissed = playerPenMissed;
    }

    public int getPlayerPasses() {
        return playerPasses;
    }

    public void setPlayerPasses(int playerPasses) {
        this.playerPasses = playerPasses;
    }

    public int getPlayerPassesAccuracy() {
        return playerPassesAccuracy;
    }

    public void setPlayerPassesAccuracy(int playerPassesAccuracy) {
        this.playerPassesAccuracy = playerPassesAccuracy;
    }

    public int getPlayerkeyPasses() {
        return playerkeyPasses;
    }

    public void setPlayerkeyPasses(int playerkeyPasses) {
        this.playerkeyPasses = playerkeyPasses;
    }

    public int getPlayerWoordworks() {
        return playerWoordworks;
    }

    public void setPlayerWoordworks(int playerWoordworks) {
        this.playerWoordworks = playerWoordworks;
    }

    public float getPlayerRating() {
        return playerRating;
    }

    public void setPlayerRating(float playerRating) {
        this.playerRating = playerRating;
    }
}
