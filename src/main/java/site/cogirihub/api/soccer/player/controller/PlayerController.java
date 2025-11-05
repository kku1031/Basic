package site.cogirihub.api.soccer.player.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.cogirihub.api.domain.Messenger;
import site.cogirihub.api.soccer.player.domain.PlayerDTO;
import site.cogirihub.api.soccer.player.service.PlayerService;

@RestController
@RequestMapping("/soccer/players")
@RequiredArgsConstructor
public class PlayerController {

    private final PlayerService playerService;

    @PostMapping("/save")
    public Messenger save(PlayerDTO player) {
        return playerService.save(player);
    }

    @PostMapping("/all")
    public Messenger saveAll(List<PlayerDTO> players) {
        return playerService.saveAll(players);
    }

    @GetMapping("/all")
    public Messenger findAll() {
        return playerService.findAll();
    }

    @GetMapping("id/{id}")
    public Messenger findById(String id) {
        return playerService.findById(id);
    }

    @PutMapping("{id}")
    public Messenger update(PlayerDTO player) {
        return playerService.update(player);
    }

    @DeleteMapping("/{id}")
    public Messenger delete(String id) {
        return playerService.delete(id);
    }

    
}
