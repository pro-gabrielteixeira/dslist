package com.mybackend.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mybackend.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
