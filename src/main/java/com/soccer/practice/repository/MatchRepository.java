package com.soccer.practice.repository;

import com.soccer.practice.entities.Match;
import com.soccer.practice.entities.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatchRepository extends JpaRepository<Integer, Match> {

    List<Match> findByTournament(Tournament tournament);
}
