package site.cogirihub.api.soccer.team.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import site.cogirihub.api.domain.Messenger;
import site.cogirihub.api.soccer.team.domain.TeamDTO;

@Repository
public class TeamRepository {

    public Messenger save(TeamDTO teamDTO) {
        Messenger messenger = new Messenger(200, "Success");
        return new Messenger(200, "Success");
    }

    public Messenger saveall(List<TeamDTO> teamDTOs) {
        Messenger messenger = new Messenger(200, "Success");
        return messenger;
    }

    public Messenger update(TeamDTO teamDTO) {
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
