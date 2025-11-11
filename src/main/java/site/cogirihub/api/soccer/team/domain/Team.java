package site.cogirihub.api.soccer.team.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import site.cogirihub.api.soccer.player.domain.Player;
import site.cogirihub.api.soccer.stadium.domain.Stadium;

@Data
@Entity
@Table(name = "teams")
public class Team {

    @Id
    private String teamId;

    private String regionName;

    private String teamName;

    private String eTeamName;

    private String origYyyy;

    private String zipCode1;

    private String zipCode2;

    private String address;

    private String ddd;

    private String tel;

    private String fax;

    private String homepage;

    private String owner;

    @OneToOne
    @JoinColumn(name = "stadium_id")
    private Stadium stadium;

    @OneToMany(mappedBy = "team")
    private List<Player> players;

}
