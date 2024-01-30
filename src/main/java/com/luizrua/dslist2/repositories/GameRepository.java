package com.luizrua.dslist2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizrua.dslist2.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
