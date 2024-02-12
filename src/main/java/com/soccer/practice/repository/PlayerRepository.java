package com.soccer.practice.repository;

import com.soccer.practice.entities.Player;
import com.soccer.practice.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer> {

    List<Player> findByTeam(Team team);

}
