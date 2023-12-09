package com.hexaware.livecoding.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.livecoding.dto.PlayerDTO;
import com.hexaware.livecoding.entity.Player;
import com.hexaware.livecoding.repository.PlayerRepository;

@Service
public class PlayerServiceImp implements IPlayerService {
	
	private PlayerRepository repository;
	@Autowired
	public PlayerServiceImp(PlayerRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Player addPlayer(PlayerDTO playerDTO) {
		Player player=new Player();
		player.setPlayerId(playerDTO.getPlayerId());
		player.setPlayerName(playerDTO.getPlayerName());
		player.setTeamName(playerDTO.getTeamName());
		player.setJerseyNumber(playerDTO.getJerseyNumber());
		player.setRole(playerDTO.getRole());
		player.setCountryName(playerDTO.getCountryName());
		player.setDescription(playerDTO.getDescription());
		player.setTotalMatches(playerDTO.getTotalMatches());
		return repository.save(player);
	}
	@Override
	public Player updatePlayer(PlayerDTO playerDTO) {
		Player player=new Player();
		player.setPlayerId(playerDTO.getPlayerId());
		player.setPlayerName(playerDTO.getPlayerName());
		player.setTeamName(playerDTO.getTeamName());
		player.setJerseyNumber(playerDTO.getJerseyNumber());
		player.setRole(playerDTO.getRole());
		player.setCountryName(playerDTO.getCountryName());
		player.setDescription(playerDTO.getDescription());
		player.setTotalMatches(playerDTO.getTotalMatches());
		return repository.save(player);
	}
	@Override
	public List<Player>findByCountry(String countryName)
	{
		return repository.findByCountryName(countryName);
	}
	 
	@Override
	public List<Player> getAllPlayers() {
	
		return repository.findAll();
	}

}
