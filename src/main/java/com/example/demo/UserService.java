package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.demo.User;
import com.example.demo.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public User createUser(User user) {
        // パスワードをハッシュ化
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        // デフォルトロール
        if (user.getRole() == null) {
            user.setRole("USER");
        }

        return userRepository.save(user);
    }
    
}
