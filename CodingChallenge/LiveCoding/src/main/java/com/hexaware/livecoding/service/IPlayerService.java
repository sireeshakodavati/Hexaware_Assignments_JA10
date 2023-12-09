package com.hexaware.livecoding.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hexaware.livecoding.dto.PlayerDTO;
import com.hexaware.livecoding.entity.Player;


public interface IPlayerService {

	public Player addPlayer(PlayerDTO playerDTO);
	public List<Player> getAllPlayers();
	public Player updatePlayer(PlayerDTO playerDTO);
	public List<Player>findByCountry(String countryName);
}
