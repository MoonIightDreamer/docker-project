package ru.dgu.dockerproject.web;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.dgu.dockerproject.model.User;
import ru.dgu.dockerproject.repository.UserRepository;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserRestController {

    private final UserRepository userRepository;

    @GetMapping("/{id}")
    public User get(@PathVariable Long id) {
        return userRepository.findById(id).get();
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    @GetMapping("last")
    public User getLast() {
        return userRepository.findTopByOrderByIdDesc();
    }

    @PostMapping("users/")
    @ResponseStatus(HttpStatus.CREATED)
    public User save(@RequestBody User user) {
        return userRepository.save(user);
    }
}
