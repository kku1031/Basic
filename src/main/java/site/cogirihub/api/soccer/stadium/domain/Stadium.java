package site.cogirihub.api.soccer.stadium.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import site.cogirihub.api.soccer.schedule.domain.Schedule;
import site.cogirihub.api.soccer.team.domain.Team;

@Data
@Entity
@Table(name = "stadiums")
public class Stadium {

    @Id
    private String stadiumId;

    private String stadiumName;

    private String hometeamId;

    private Integer seatCount;

    private String address;

    private String ddd;

    private String tel;

    @OneToOne(mappedBy = "stadium")
    private Team team;

    @OneToMany(mappedBy = "stadium")
    private List<Schedule> schedules;

}
