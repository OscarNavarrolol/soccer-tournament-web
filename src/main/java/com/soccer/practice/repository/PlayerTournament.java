package com.soccer.practice.repository;

import com.soccer.practice.entities.Match;
import com.soccer.practice.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerTournament extends JpaRepository<Integer, Player> {
}
