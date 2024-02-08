package com.soccer.practice.repository;

import com.soccer.practice.entities.Match;
import com.soccer.practice.entities.Team;
import com.soccer.practice.entities.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TournamentRepository extends JpaRepository<Integer, TournamentRepository> {


    List<Team> findAllTeamsByTournament(Tournament tournament);

}
