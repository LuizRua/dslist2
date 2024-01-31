package com.luizrua.dslist2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizrua.dslist2.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
