package site.cogirihub.api.soccer.team.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import site.cogirihub.api.domain.Messenger;
import site.cogirihub.api.soccer.team.domain.TeamDTO;

@Repository
public class TeamRepository {

    public Messenger save(TeamDTO teamDTO) {
        return Messenger.builder()
                .code(200)
                .message("success")
                .build();
    }

    public Messenger update(TeamDTO teamDTO) {
        return Messenger.builder()
                .code(200)
                .message("success")
                .build();
    }

    public Messenger delete(String id) {
        return Messenger.builder()
                .code(200)
                .message("success")
                .build();
    }

    public Messenger findById(String id) {
        return Messenger.builder()
                .code(200)
                .message("success")
                .build();
    }

    public Messenger findAll() {
        return Messenger.builder()
                .code(200)
                .message("success")
                .build();
    }

    public Messenger saveAll(List<TeamDTO> teamDTOs) {
        return Messenger.builder()
                .code(200)
                .message("success")
                .build();
    }
}
