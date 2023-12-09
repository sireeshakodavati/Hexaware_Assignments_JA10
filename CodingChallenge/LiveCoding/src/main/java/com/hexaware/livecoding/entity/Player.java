package com.hexaware.livecoding.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;


@Entity
@Table(name = "player_details")
public class Player {
	@Id
   private int playerId;
   @Pattern (regexp = "[A-Z][a-z]{3,20}")
   private String playerName;
   @Min(value = 1)
   @Max(value = 99)
   private int jerseyNumber;
   private String role;
   private int totalMatches;
   private String teamName;
   @NotBlank(message = "countryName cannot be blank")
   private String countryName;
   @Pattern (regexp = "[A-Z][a-z]{3,20}")
   private String description;
   
public Player() {
	super();
}
public Player(int playerId, String playerName, int jerseyNumber, String role, int totalMatches, String teamName,
		String countryName, String description) {
	super();
	this.playerId = playerId;
	this.playerName = playerName;
	this.jerseyNumber = jerseyNumber;
	this.role = role;
	this.totalMatches = totalMatches;
	this.teamName = teamName;
	this.countryName = countryName;
	this.description = description;
}
public int getPlayerId() {
	return playerId;
}
public void setPlayerId(int playerId) {
	this.playerId = playerId;
}
public String getPlayerName() {
	return playerName;
}
public void setPlayerName(String playerName) {
	this.playerName = playerName;
}
public int getJerseyNumber() {
	return jerseyNumber;
}
public void setJerseyNumber(int jerseyNumber) {
	this.jerseyNumber = jerseyNumber;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public int getTotalMatches() {
	return totalMatches;
}
public void setTotalMatches(int totalMatches) {
	this.totalMatches = totalMatches;
}
public String getTeamName() {
	return teamName;
}
public void setTeamName(String teamName) {
	this.teamName = teamName;
}
public String getCountryName() {
	return countryName;
}
public void setCountryName(String countryName) {
	this.countryName = countryName;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
   
}
