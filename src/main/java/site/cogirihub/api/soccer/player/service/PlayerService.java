package site.cogirihub.api.soccer.player.service;

import java.util.List;

import site.cogirihub.api.domain.Messenger;
import site.cogirihub.api.soccer.player.domain.PlayerDTO;

public interface PlayerService {

    Messenger save(PlayerDTO playerDTO);

    Messenger update(PlayerDTO playerDTO);

    Messenger delete(String id);

    Messenger findById(String id);

    Messenger findAll();

    Messenger saveAll(List<PlayerDTO> playerDTOs);

    
}
