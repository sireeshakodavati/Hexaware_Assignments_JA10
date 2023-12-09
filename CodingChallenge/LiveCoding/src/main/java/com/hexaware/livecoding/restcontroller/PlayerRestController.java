package com.hexaware.livecoding.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.livecoding.dto.PlayerDTO;
import com.hexaware.livecoding.entity.Player;
import com.hexaware.livecoding.service.IPlayerService;

import jakarta.validation.Valid;
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/player")
@RestController
public class PlayerRestController {

	private IPlayerService service;

	@Autowired
	public PlayerRestController(IPlayerService service) {
		super();
		this.service = service;
	}

	@PostMapping("/add")
	public Player addPlayer(@Valid @RequestBody PlayerDTO playerDTO) {

		return service.addPlayer(playerDTO);
	}


	@GetMapping("/getall")
	public List<Player> getAllPlayers() {
		return service.getAllPlayers();
	}
	
	@PutMapping("/update")
	public Player updatePlayer(@Valid @RequestBody PlayerDTO playerDTO) {

		return service.updatePlayer(playerDTO);
	}
	@GetMapping("/getbycountryname/{countryName}")
	public List<Player>getByName(@PathVariable  String countryName)
	{
		return service.findByCountry(countryName);
	}
}
