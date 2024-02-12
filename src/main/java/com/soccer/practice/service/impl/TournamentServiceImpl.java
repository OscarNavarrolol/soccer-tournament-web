package com.soccer.practice.service.impl;

import com.soccer.practice.entities.Match;
import com.soccer.practice.entities.Tournament;
import com.soccer.practice.repository.MatchRepository;
import com.soccer.practice.repository.TournamentRepository;
import com.soccer.practice.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TournamentServiceImpl implements TournamentService {

    @Autowired
    private TournamentRepository tournamentRepository;

    @Override
    public List<Tournament> getAllTournament() {
        return tournamentRepository.findAll();
    }

    @Override
    public Tournament saveTournament(Tournament tournament) {
        tournamentRepository.save(tournament);
        return tournamentRepository.save(tournament);
    }

    @Override
    public Tournament getTournamentById(Integer id) {
        return tournamentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteTournament(Integer id) {
        tournamentRepository.deleteById(id);
    }

    @Override
    public Tournament updateTournament(Integer id, Tournament tournament) {
        Tournament oldTournament = tournamentRepository.findById(id).orElse(null);
        if (oldTournament != null){
            oldTournament.setTournamentName(tournament.getTournamentName());
            oldTournament.setStartDay(tournament.getStartDay());
            oldTournament.setEndDay(tournament.getEndDay());
            oldTournament.setPrizeValue(tournament.getPrizeValue());
            oldTournament.setTeamList(tournament.getTeamList());
            oldTournament.setMatchList(tournament.getMatchList());
            return tournamentRepository.save(oldTournament);
        }
        return null;
    }

    @Override
    public List<Match> getAllMatchesByTournament(Tournament tournament) {
        if (tournament != null) {
            return tournament.getMatchList();
        } else {
            return new ArrayList<>();
        }
    }

}
