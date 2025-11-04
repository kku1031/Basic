package site.cogirihub.api.user.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import site.cogirihub.api.domain.Messenger;
import site.cogirihub.api.user.domain.UserDTO;

@Repository
public class UserRepository {

    public Messenger save(UserDTO userDTO) {
        Messenger messenger = new Messenger(200, "Success");
        return new Messenger(200, "Success");
    }

    public Messenger saveall(List<UserDTO> userDTOs) {
        Messenger messenger = new Messenger(200, "Success");
        return messenger;
    }

    public Messenger update(UserDTO userDTO) {
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
