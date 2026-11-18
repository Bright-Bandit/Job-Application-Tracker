package com.YuHao.jobtracker.controller;

import com.YuHao.jobtracker.dto.RegisterRequest;
import com.YuHao.jobtracker.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:5173")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(
            @RequestBody RegisterRequest request){

        authService.register(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Account registered successfully");
    }
}
