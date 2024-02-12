package com.soccer.practice.service.impl;

import com.soccer.practice.entities.Match;
import com.soccer.practice.entities.Tournament;
import com.soccer.practice.repository.MatchRepository;
import com.soccer.practice.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MatchServiceImpl implements MatchService {

    @Autowired
    private MatchRepository matchRepository;

    @Override
    public List<Match> getAllMatch() {
        return matchRepository.findAll();

    }

    @Override
    public Match saveMatch (Match match) {
        return matchRepository.save(match);
    }

    @Override
    public Match getMatchById(Integer id) {
        return matchRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteMatch(Integer id) {
        matchRepository.deleteById(id);
    }

    @Override
    public Match updateMatch(Integer id, Match match) {

        Match oldMatch= matchRepository.findById(id).orElse(null);
        if (oldMatch!= null){
            oldMatch.setDateMatch(match.getDateMatch());
            oldMatch.setHomeResult(match.getHomeResult());
            oldMatch.setAwayResult(match.getAwayResult());
            return matchRepository.save(oldMatch);
        }

        return null;
    }

    @Override
    public List<Match> getAllMatchesByTournament(Tournament tournament) {
        return matchRepository.findByTournament(tournament);
    }
}
