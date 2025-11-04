package site.cogirihub.api.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.cogirihub.api.domain.Messenger;
import site.cogirihub.api.user.domain.UserDTO;
import site.cogirihub.api.user.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public Messenger save(UserDTO userDTO) {
        return userRepository.save(userDTO);
    }

    @Override
    public Messenger saveAll(List<UserDTO> userDTOs) {
        return userRepository.saveall(userDTOs);
    }

    @Override
    public Messenger update(UserDTO userDTO) {
        return userRepository.update(userDTO);
    }

    @Override
    public Messenger delete(String id) {
        return userRepository.delete(id);
    }

    @Override
    public Messenger findById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public Messenger findAll() {
        return userRepository.findAll();
    }
    
}
