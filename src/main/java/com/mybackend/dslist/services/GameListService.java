package com.mybackend.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybackend.dslist.dto.GameListDTO;
import com.mybackend.dslist.entities.GameList;
import com.mybackend.dslist.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	
	public List<GameListDTO> findAll() {
		List<GameList> list = gameListRepository.findAll();
		List<GameListDTO> result = list.stream().map(x -> new GameListDTO(x)).toList();
		return result;
	}
}
