package com.soccer.practice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "player_name")
    private String playerName;
    private String position;
    private Integer age;

    @ManyToOne(targetEntity = Team.class)
    @JoinColumn(name = "team_id")
    private Team team;

}
