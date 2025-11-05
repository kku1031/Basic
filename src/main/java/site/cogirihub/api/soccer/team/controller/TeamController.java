package site.cogirihub.api.soccer.team.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.cogirihub.api.domain.Messenger;
import site.cogirihub.api.soccer.team.domain.TeamDTO;
import site.cogirihub.api.soccer.team.service.TeamService;

@RestController
@RequestMapping("/soccer/teams")
@RequiredArgsConstructor
public class TeamController {

    private final TeamService teamService;

    @PostMapping("/save")
    public Messenger save(TeamDTO team) {
        return teamService.save(team);
    }

    @PostMapping("/all")
    public Messenger saveAll(List<TeamDTO> teams) {
        return teamService.saveAll(teams);
    }

    @GetMapping("/all")
    public Messenger findAll() {
        return teamService.findAll();
    }

    @GetMapping("id/{id}")
    public Messenger findById(String id) {
        return teamService.findById(id);
    }

    @PutMapping("{id}")
    public Messenger update(TeamDTO team) {
        return teamService.update(team);
    }

    @DeleteMapping("/{id}")
    public Messenger delete(String id) {
        return teamService.delete(id);
    }
}
