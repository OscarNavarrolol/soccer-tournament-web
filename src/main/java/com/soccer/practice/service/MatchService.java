package com.soccer.practice.service;

import com.soccer.practice.entities.Match;
import com.soccer.practice.entities.Tournament;

import java.util.List;

public interface MatchService {

    public List<Match> getAllMatch();
    public Match saveMatch (Match match);

    public Match getMatchById(Integer id);

    public void deleteMatch(Integer id);

    public Match updateMatch(Integer id,Match match);

    List<Match> getAllMatchesByTournament(Tournament tournament);
}
