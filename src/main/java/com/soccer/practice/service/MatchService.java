package com.soccer.practice.service;

import com.soccer.practice.entities.Match;
import com.soccer.practice.entities.Tournament;

import java.util.List;

public interface MatchService {

    public List<Match> getAllProducts();
    public Match saveProduct (Match match);

    public Match getProductById(Integer id);

    public void deleteProduct(Integer id);

    public Match updateProduct(Integer id,Match match);

    List<Match> getAllMatchesByTournament(Tournament tournament);
}
