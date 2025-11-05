package site.cogirihub.api.soccer.schedule.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.cogirihub.api.domain.Messenger;
import site.cogirihub.api.soccer.schedule.domain.ScheduleDTO;
import site.cogirihub.api.soccer.schedule.service.ScheduleService;

@RestController
@RequestMapping("/soccer/schedules")
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleService;

    @PostMapping("/save")
    public Messenger save(ScheduleDTO schedule) {
        return scheduleService.save(schedule);
    }

    @PostMapping("/all")
    public Messenger saveAll(List<ScheduleDTO> schedules) {
        return scheduleService.saveAll(schedules);
    }

    @GetMapping("/all")
    public Messenger findAll() {
        return scheduleService.findAll();
    }

    @GetMapping("id/{id}")
    public Messenger findById(String id) {
        return scheduleService.findById(id);
    }

    @PutMapping("{id}")
    public Messenger update(ScheduleDTO schedule) {
        return scheduleService.update(schedule);
    }

    @DeleteMapping("/{id}")
    public Messenger delete(String id) {
        return scheduleService.delete(id);
    }
}
