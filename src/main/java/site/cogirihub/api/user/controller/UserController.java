package site.cogirihub.api.user.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.cogirihub.api.domain.Messenger;
import site.cogirihub.api.user.domain.UserDTO;
import site.cogirihub.api.user.service.UserService;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/save")
    public Messenger save(UserDTO user) {
        return userService.save(user);
    }

    @PostMapping("/all")
    public Messenger saveAll(List<UserDTO> users) {
        return userService.saveAll(users);
    }

    @GetMapping("/all")
    public Messenger findAll() {
        return userService.findAll();
    }

    @GetMapping("id/{id}")
    public Messenger findById(String id) {
        return userService.findById(id);
    }

    @PutMapping("{id}")
    public Messenger update(UserDTO user) {
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    public Messenger delete(String id) {
        return userService.delete(id);
    }
}