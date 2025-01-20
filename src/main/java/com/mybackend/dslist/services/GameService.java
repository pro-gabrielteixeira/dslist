package com.mybackend.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybackend.dslist.dto.GameMinDTO;
import com.mybackend.dslist.entities.Game;
import com.mybackend.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> list = gameRepository.findAll();
		List<GameMinDTO> result = list.stream().map(x -> new GameMinDTO(x)).toList();
		return result;
	}
}
