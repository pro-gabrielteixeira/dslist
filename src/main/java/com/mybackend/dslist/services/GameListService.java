package com.mybackend.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybackend.dslist.dto.GameListDTO;
import com.mybackend.dslist.entities.GameList;
import com.mybackend.dslist.projections.GameMinProjection;
import com.mybackend.dslist.repositories.GameListRepository;
import com.mybackend.dslist.repositories.GameRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameListDTO> findAll() {
		List<GameList> list = gameListRepository.findAll();
		List<GameListDTO> result = list.stream().map(x -> new GameListDTO(x)).toList();
		return result;
	}
	
	public void move(Long listId, int sourceIndex, int destinationIndex) {
		
		List<GameMinProjection> list = gameRepository.searchByList(listId);
		
		GameMinProjection src = list.remove(sourceIndex);
		list.add(destinationIndex, src);
		
		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		int max = sourceIndex > destinationIndex ? sourceIndex : destinationIndex;
		
		for (int i = min; i <= max; i++) {
			gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
		}
	}
}
