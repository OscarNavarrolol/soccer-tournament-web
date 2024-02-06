package com.soccer.practice.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "team_name")
    private String teamName;
    private String hood;

    @OneToMany(targetEntity = Player.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "team")
    private List<Player> playerList;

    @ManyToMany
    private List<Tournament> tournamentList;



}
