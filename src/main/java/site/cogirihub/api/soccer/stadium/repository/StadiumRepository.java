package site.cogirihub.api.soccer.stadium.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import site.cogirihub.api.domain.Messenger;
import site.cogirihub.api.soccer.stadium.domain.StadiumDTO;

@Repository
public class StadiumRepository {

    public Messenger save(StadiumDTO stadiumDTO) {
        Messenger messenger = new Messenger(200, "Success");
        return new Messenger(200, "Success");
    }

    public Messenger saveall(List<StadiumDTO> stadiumDTOs) {
        Messenger messenger = new Messenger(200, "Success");
        return messenger;
    }

    public Messenger update(StadiumDTO stadiumDTO) {
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
