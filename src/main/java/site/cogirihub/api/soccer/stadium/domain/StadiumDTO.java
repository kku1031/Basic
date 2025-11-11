package site.cogirihub.api.soccer.stadium.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StadiumDTO {

    private Long id;
    private String stadiumUk;
    private String stadiumName;
    private String hometeamId;
    private Integer seatCount;
    private String address;
    private String ddd;
    private String tel;
    
}
