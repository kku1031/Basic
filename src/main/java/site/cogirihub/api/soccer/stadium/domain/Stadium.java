package site.cogirihub.api.soccer.stadium.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "stadiums")
public class Stadium {

    @Id
    private Long id;
    private String stadiumUK; // stadium_id
    private String stadiumName; // stadium_name
    private String hometeamId; // hometeam_id
    private String seatCount; // seat_count
    private String address; // address
    private String ddd; // ddd
    private String tel; // tel

}
