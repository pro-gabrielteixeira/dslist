package com.mybackend.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mybackend.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
