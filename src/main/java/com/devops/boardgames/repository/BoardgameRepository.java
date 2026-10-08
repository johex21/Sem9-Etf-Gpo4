package com.devops.boardgames.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devops.boardgames.model.Boardgame;

@Repository
public interface BoardgameRepository extends JpaRepository<Boardgame, Long> {
}