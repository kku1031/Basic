package site.cogirihub.api.soccer.schedule.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleDTO {

    private String stadiumUk;
    private String scheDate;
    private String gubun;
    private String hometeamUk;
    private String awayteamUk;
    private String homeScore;
    private String awayScore;

}
