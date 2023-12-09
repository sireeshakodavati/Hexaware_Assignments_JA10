package com.hexaware.livecoding.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.livecoding.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer>{
List<Player>findByCountryName(String countryName);
}
