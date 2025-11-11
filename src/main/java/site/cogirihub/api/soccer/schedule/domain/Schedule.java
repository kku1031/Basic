package site.cogirihub.api.soccer.schedule.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import site.cogirihub.api.soccer.stadium.domain.Stadium;

@Data
@Entity
@Table(name = "schedules")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String scheDate;

    @Column(name = "stadium_id")
    private String stadiumUk;

    @ManyToOne
    @JoinColumn(name = "stadium_id", insertable = false, updatable = false)
    private Stadium stadium;

    private String gubun;

    private String hometeamId;

    private String awayteamId;

    private Integer homeScore;

    private Integer awayScore;

}
