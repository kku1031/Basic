package site.cogirihub.api.soccer.schedule.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import site.cogirihub.api.domain.Messenger;
import site.cogirihub.api.soccer.schedule.domain.ScheduleDTO;

@Repository
public class ScheduleRepository {

    public Messenger save(ScheduleDTO scheduleDTO) {
        Messenger messenger = new Messenger(200, "Success");
        return new Messenger(200, "Success");
    }

    public Messenger saveall(List<ScheduleDTO> scheduleDTOs) {
        Messenger messenger = new Messenger(200, "Success");
        return messenger;
    }

    public Messenger update(ScheduleDTO scheduleDTO) {
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
