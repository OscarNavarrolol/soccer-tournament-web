package com.soccer.practice.service;

import com.soccer.practice.entities.Player;
import com.soccer.practice.entities.Team;

import java.util.List;

public interface PlayerService {
    public List<Player> getAllPlayer();

    public Player savePlayer (Player player);

    public Player getPlayerById(Integer id);

    public void deletePlayer (Integer id);

    public Player updatePlayer (Integer id,Player player);
    List<Player> getAllPlayersByTeam(Team team);
}
