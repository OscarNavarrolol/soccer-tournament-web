package com.soccer.practice.repository;

import com.soccer.practice.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TournamentRepository extends JpaRepository<Integer, TournamentRepository> {
}
