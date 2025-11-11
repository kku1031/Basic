package site.cogirihub.api.soccer.player.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import site.cogirihub.api.domain.Messenger;
import site.cogirihub.api.soccer.player.domain.PlayerDTO;

@Repository
public class PlayerRepository {

    public Messenger save(PlayerDTO playerDTO) {
        return Messenger.builder()
                .code(200)
                .message("success")
                .build();
    }

    public Messenger update(PlayerDTO playerDTO) {
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

    public Messenger saveAll(List<PlayerDTO> playerDTOs) {
        return Messenger.builder()
                .code(200)
                .message("success")
                .build();
    }

    
}
