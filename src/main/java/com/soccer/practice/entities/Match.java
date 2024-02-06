package com.soccer.practice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="match")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "date_match",columnDefinition = "DATE")
    private LocalDate dateMatch;
    @Column(name = "home_result")
    private Integer homeResult;
    @Column(name = "away_result")
    private Integer awayResult;

    @ManyToOne(targetEntity = Tournament.class)
    @JoinColumn(name = "tournament_id")
    private Tournament tournament;

    @ManyToOne
    @JoinColumn(name = "home_team", referencedColumnName = "id")
    private Team homeTeam;

    @ManyToOne
    @JoinColumn(name = "away_team", referencedColumnName = "id")
    private Team awayTeam;
}
