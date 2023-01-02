package ru.dgu.dockerproject.web;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.dgu.dockerproject.model.User;
import ru.dgu.dockerproject.repository.UserRepository;

@AllArgsConstructor
@RestController
public class UserRestController {

    private final UserRepository userRepository;

    @GetMapping("/api/users/last")
    public User getLast() {
        return userRepository.findTopByOrderByIdDesc();
    }

    @PostMapping("/api/users")
    @ResponseStatus(HttpStatus.CREATED)
    public User save(@RequestBody User user) {
        return userRepository.save(user);
    }
}
