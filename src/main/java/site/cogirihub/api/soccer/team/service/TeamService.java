package site.cogirihub.api.soccer.team.service;

import java.util.List;

import site.cogirihub.api.domain.Messenger;
import site.cogirihub.api.soccer.team.domain.TeamDTO;

public interface TeamService {

    Messenger save(TeamDTO teamDTO);

    Messenger saveAll(List<TeamDTO> teamDTOs);

    Messenger update(TeamDTO teamDTO);

    Messenger delete(String id);

    Messenger findById(String id);

    Messenger findAll();
}
