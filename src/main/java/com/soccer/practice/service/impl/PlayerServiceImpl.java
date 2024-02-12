package com.soccer.practice.service.impl;

import com.soccer.practice.entities.Player;
import com.soccer.practice.entities.Team;
import com.soccer.practice.repository.PlayerRepository;
import com.soccer.practice.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public List<Player> getAllPlayer() {
        return playerRepository.findAll();
    }

    @Override
    public Player savePlayer(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public Player getPlayerById(Integer id) {
        return playerRepository.findById(id).orElse(null);
    }

    @Override
    public void deletePlayer(Integer id) {
        playerRepository.deleteById(id);
    }

    @Override
    public Player updatePlayer(Integer id, Player player) {
        return null;
    }

    @Override
    public List<Player> getAllPlayersByTeam(Team team) {
        return null;
    }
}
