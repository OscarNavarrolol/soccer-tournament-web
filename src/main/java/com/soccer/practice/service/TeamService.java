package com.soccer.practice.service;


import com.soccer.practice.entities.Team;
import com.soccer.practice.entities.Tournament;

import java.util.List;

public interface TeamService {

    public List<Team> getAllTeam();

    public Team saveTeam (Team team);

    public Team  getTeamById (Integer id);

    public void deleteTeam (Integer id);

    public Team updateTeam (Integer id,Team team);

    List<Team> getAllTeamsByTournament(Tournament tournament);

}
