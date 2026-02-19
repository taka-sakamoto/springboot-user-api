package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
public class HelloController {

    private final UserRepository repository;

    // ★ 正しいコンストラクタ（void を付けない）
    public HelloController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/users")
    public List<User> users() {
        return repository.findAll();
    }

    @PostMapping("/users") 
    public User addUser(@RequestBody User user) { 
        return repository.save(user); }

    @PutMapping("/users/{id}")
    public User updatUser(@PathVariable Long id, @RequestBody User newUser) {
        return repository.findById(id)
        .map(user -> {
            user.setName(newUser.getName());
            return repository.save(user);
        })
        .orElseThrow(() -> new RuntimeException("User not found: " + id));

    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Long id) {
        repository.deleteById(id);
}
}


