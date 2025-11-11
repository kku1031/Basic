package site.cogirihub.api.soccer.player.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import site.cogirihub.api.soccer.team.domain.Team;

@Data
@Entity
@Table(name = "players")
public class Player {

    @Id
    private Long playerId;
    private String playerName;
    private String ePlayerName;
    private String nickname;
    private String joinYyyy;
    private String position;
    private String backNo;
    private String nation;
    private String birthDate;
    private String solar;
    private String height;
    private String weight;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

}

