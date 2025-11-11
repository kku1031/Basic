package site.cogirihub.api.soccer.schedule.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.cogirihub.api.domain.Messenger;
import site.cogirihub.api.soccer.schedule.domain.ScheduleDTO;
import site.cogirihub.api.soccer.schedule.repository.ScheduleRepository;

@Service
@RequiredArgsConstructor
public class ScheduleServiceImpl implements ScheduleService {
    private final ScheduleRepository scheduleRepository;

    @Override
    public Messenger update(ScheduleDTO scheduleDTO) {
        return scheduleRepository.update(scheduleDTO);
    }

    @Override
    public Messenger delete(String id) {
        return scheduleRepository.delete(id);
    }

    @Override
    public Messenger findById(String id) {
        return scheduleRepository.findById(id);
    }

    @Override
    public Messenger findAll() {
        return scheduleRepository.findAll();
    }

    @Override
    public Messenger saveAll(List<ScheduleDTO> scheduleDTOs) {
        return scheduleRepository.saveAll(scheduleDTOs);
    }

    @Override
    public Messenger save(ScheduleDTO scheduleDTO) {
        return scheduleRepository.save(scheduleDTO);
    }
    
}
