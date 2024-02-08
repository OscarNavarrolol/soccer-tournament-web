package com.soccer.practice.repository;

import com.soccer.practice.entities.Match;
import com.soccer.practice.entities.Player;
import com.soccer.practice.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeamRepository extends JpaRepository<Integer, Team> {

    List<Player> findAllPlayersByTeam(Team team);

}
