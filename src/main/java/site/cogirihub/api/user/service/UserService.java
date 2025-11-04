package site.cogirihub.api.user.service;

import java.util.List;

import site.cogirihub.api.domain.Messenger;
import site.cogirihub.api.user.domain.UserDTO;

public interface UserService {

    Messenger save(UserDTO userDTO);

    Messenger saveAll(List<UserDTO> userDTOs);

    Messenger update(UserDTO userDTO);

    Messenger delete(String id);

    Messenger findById(String id);

    Messenger findAll();
}
