package site.cogirihub.api.soccer.player.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.cogirihub.api.domain.Messenger;
import site.cogirihub.api.soccer.player.domain.PlayerDTO;
import site.cogirihub.api.soccer.player.repository.PlayerRepository;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {
    private final PlayerRepository playerRepository;

    @Override
    public Messenger save(PlayerDTO playerDTO) {
        return playerRepository.save(playerDTO);
    }

    @Override
    public Messenger saveAll(List<PlayerDTO> playerDTOs) {
        return playerRepository.saveall(playerDTOs);
    }

    @Override
    public Messenger update(PlayerDTO playerDTO) {
        return playerRepository.update(playerDTO);
    }

    @Override
    public Messenger delete(String id) {
        return playerRepository.delete(id);
    }

    @Override
    public Messenger findById(String id) {
        return playerRepository.findById(id);
    }

    @Override
    public Messenger findAll() {
        return playerRepository.findAll();
    }

}
