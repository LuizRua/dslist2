package com.luizrua.dslist2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luizrua.dslist2.dto.GameListDTO;
import com.luizrua.dslist2.dto.GameMinDTO;
import com.luizrua.dslist2.services.GameListService;
import com.luizrua.dslist2.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll() {

		List<GameListDTO> result = gameListService.findAll();
		return result;

	}

	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList( @PathVariable Long listId) {

		List<GameMinDTO> result = gameService.findByList(listId);
		return result;

	}

}
