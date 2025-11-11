package site.cogirihub.api.soccer.player.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
// DTO가 VO 역할도 함. -> builder로 가서 구조 자체가 달라짐.
public class PlayerDTO {

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
    private String teamId;

}
