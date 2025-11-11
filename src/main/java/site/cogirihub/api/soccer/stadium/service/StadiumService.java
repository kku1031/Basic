package site.cogirihub.api.soccer.stadium.service;

import java.util.List;

import site.cogirihub.api.domain.Messenger;
import site.cogirihub.api.soccer.stadium.domain.StadiumDTO;

public interface StadiumService {

    Messenger save(StadiumDTO stadiumDTO);

    Messenger update(StadiumDTO stadiumDTO);

    Messenger delete(String id);

    Messenger findById(String id);

    Messenger findAll();

    Messenger saveAll(List<StadiumDTO> stadiumDTOs);
}
