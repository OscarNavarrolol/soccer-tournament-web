package com.soccer.practice.service;


import com.soccer.practice.entities.Match;
import com.soccer.practice.entities.Tournament;

import java.util.List;

public interface TournamentService {

    public List<Tournament> getAllTournament();

    public Tournament saveTournament (Tournament tournament);

    public Tournament  getTournamentById(Integer id);

    public void deleteTournament (Integer id);

    public Tournament updateTournament(Integer id,Tournament tournament);

    List<Match> getAllMatchesByTournament(Tournament tournament);


}
