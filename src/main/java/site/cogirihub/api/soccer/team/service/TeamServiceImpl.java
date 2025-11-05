package site.cogirihub.api.soccer.team.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.cogirihub.api.domain.Messenger;
import site.cogirihub.api.soccer.team.domain.TeamDTO;
import site.cogirihub.api.soccer.team.repository.TeamRepository;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService {
    private final TeamRepository teamRepository;

    @Override
    public Messenger save(TeamDTO teamDTO) {
        return teamRepository.save(teamDTO);
    }

    @Override
    public Messenger saveAll(List<TeamDTO> teamDTOs) {
        return teamRepository.saveall(teamDTOs);
    }

    @Override
    public Messenger update(TeamDTO teamDTO) {
        return teamRepository.update(teamDTO);
    }

    @Override
    public Messenger delete(String id) {
        return teamRepository.delete(id);
    }

    @Override
    public Messenger findById(String id) {
        return teamRepository.findById(id);
    }

    @Override
    public Messenger findAll() {
        return teamRepository.findAll();
    }
    
}
