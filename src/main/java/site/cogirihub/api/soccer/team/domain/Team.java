package site.cogirihub.api.soccer.team.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "teams")
public class Team {

    @Id
    private String teamUK;
    private String regionName;
    private String teamName;
    private String eTeamName;
    private String origYyyy;
    private String stadiumId;
    private String zipCode1;
    private String zipCode2;
    private String address;
    private String ddd;
    private String tel;
    private String fax;
    private String homepage;
    private String owner;

}
