package site.cogirihub.api.soccer.stadium.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.cogirihub.api.domain.Messenger;
import site.cogirihub.api.soccer.stadium.domain.StadiumDTO;
import site.cogirihub.api.soccer.stadium.service.StadiumService;

@RestController
@RequestMapping("/soccer/stadiums")
@RequiredArgsConstructor
public class StadiumController {

    private final StadiumService stadiumService;

    @PostMapping("/save")
    public Messenger save(StadiumDTO stadium) {
        return stadiumService.save(stadium);
    }

    @PostMapping("/all")
    public Messenger saveAll(List<StadiumDTO> stadiums) {
        return stadiumService.saveAll(stadiums);
    }

    @GetMapping("/all")
    public Messenger findAll() {
        return stadiumService.findAll();
    }

    @GetMapping("id/{id}")
    public Messenger findById(String id) {
        return stadiumService.findById(id);
    }

    @PutMapping("{id}")
    public Messenger update(StadiumDTO stadium) {
        return stadiumService.update(stadium);
    }

    @DeleteMapping("/{id}")
    public Messenger delete(String id) {
        return stadiumService.delete(id);
    }
}
