package site.cogirihub.api.soccer.schedule.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "schedules")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String stadiumUk;
    private String scheDate;
    private String gubun;
    private String hometeamUk;
    private String awayteamUk;
    private String homeScore;
    private String awayScore;

}
