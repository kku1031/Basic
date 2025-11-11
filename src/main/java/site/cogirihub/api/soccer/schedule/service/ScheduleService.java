package site.cogirihub.api.soccer.schedule.service;

import java.util.List;

import site.cogirihub.api.domain.Messenger;
import site.cogirihub.api.soccer.schedule.domain.ScheduleDTO;

public interface ScheduleService {

    Messenger save(ScheduleDTO scheduleDTO);

    Messenger update(ScheduleDTO scheduleDTO);

    Messenger delete(String id);

    Messenger findById(String id);

    Messenger findAll();

    Messenger saveAll(List<ScheduleDTO> scheduleDTOs);
}
