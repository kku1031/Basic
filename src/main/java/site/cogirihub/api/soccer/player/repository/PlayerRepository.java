package site.cogirihub.api.soccer.player.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import site.cogirihub.api.domain.Messenger;
import site.cogirihub.api.soccer.player.domain.PlayerDTO;

@Repository
public class PlayerRepository {

    public Messenger save(PlayerDTO playerDTO) {
        Messenger messenger = new Messenger(200, "Success");
        return new Messenger(200, "Success");
    }

    public Messenger saveall(List<PlayerDTO> playerDTOs) {
        Messenger messenger = new Messenger(200, "Success");
        return messenger;
    }

    public Messenger update(PlayerDTO playerDTO) {
        Messenger messenger = new Messenger(200, "Success");
        return messenger;
    }

    public Messenger delete(String id) {
        Messenger messenger = new Messenger(200, "Success");
        return messenger;
    }

    public Messenger findById(String id) {
        Messenger messenger = new Messenger(200, "Success");
        return messenger;
    }

    public Messenger findAll() {
        Messenger messenger = new Messenger(200, "Success");
        return messenger;
    }

    
}
