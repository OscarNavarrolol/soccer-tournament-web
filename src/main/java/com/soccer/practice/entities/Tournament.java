package com.soccer.practice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tournament")
public class Tournament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "tournament_name")
    private String tournamentName;
    @Column(name = "start_day",columnDefinition = "DATE")
    private LocalDate startDay;
    @Column(name = "end_date",columnDefinition = "DATE")
    private LocalDate endDay;
    @Column(name = "prize_value")
    private Long prizeValue;


    @ManyToMany(targetEntity = Team.class,fetch = FetchType.LAZY)
    @JoinTable(name = "team_tournament", joinColumns = @JoinColumn(name = "tournament_id"), inverseJoinColumns = @JoinColumn(name = "team_id"))
    private List<Team> teamList;

    @OneToMany(targetEntity = Match.class,fetch = FetchType.LAZY,mappedBy = "tournament")
    List<Match>  matchList;

}
