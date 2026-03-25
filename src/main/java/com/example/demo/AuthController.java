package com.example.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;



@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtUtil jwtUtil;
    private final BCryptPasswordEncoder passwordEncoder;

    public AuthController(JwtUtil jwtUtil, BCryptPasswordEncoder passwordEncoder) {
        this.jwtUtil = jwtUtil;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {

        // 本来は DB でユーザー検索をするが、今は固定でテスト
        if (!request.getEmail().equals("test@example.com") ||
            !request.getPassword().equals("password")) {
                throw new RuntimeException("Invalid credentials");
        }

        // JWT を生成
        String token = jwtUtil.generateToken("test@example.com", "USER");

        return new LoginResponse(token);
    }
}