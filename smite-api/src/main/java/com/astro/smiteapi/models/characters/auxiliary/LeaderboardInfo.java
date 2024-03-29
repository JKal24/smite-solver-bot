package com.astro.smiteapi.models.characters.auxiliary;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LeaderboardInfo {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @JsonProperty("losses")
    private Integer losses;

    @JsonProperty("player_id")
    private Integer playerID;

    @JsonProperty("player_name")
    private String playerName;

    @JsonProperty("player_ranking")
    private Float playerRanking;

    @JsonProperty("rank")
    private Integer rank;

    @JsonProperty("wins")
    private Integer wins;

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public Integer getPlayerID() {
        return playerID;
    }

    public void setPlayerID(Integer playerID) {
        this.playerID = playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Float getPlayerRanking() {
        return playerRanking;
    }

    public void setPlayerRanking(Float playerRanking) {
        this.playerRanking = playerRanking;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    @Override
    public String toString() {
        return "LeaderboardRanking{" +
                "losses=" + losses +
                ", playerID=" + playerID +
                ", playerName='" + playerName + '\'' +
                ", playerRanking=" + playerRanking +
                ", rank=" + rank +
                ", wins=" + wins +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
