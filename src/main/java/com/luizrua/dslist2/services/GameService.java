package com.luizrua.dslist2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luizrua.dslist2.dto.GameMinDTO;
import com.luizrua.dslist2.entities.Game;
import com.luizrua.dslist2.repositories.GameRepository;

@Service
public class GameService {

	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
	List<Game> result = gameRepository.findAll();
	List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
	return dto;
		
		
	}
	
	
}
