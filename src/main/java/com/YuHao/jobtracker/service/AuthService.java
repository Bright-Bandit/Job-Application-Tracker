package com.YuHao.jobtracker.service;

import com.YuHao.jobtracker.entity.User;
import com.YuHao.jobtracker.dto.RegisterRequest;
import com.YuHao.jobtracker.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.security.crypto.password.PasswordEncoder;


@Service
public class AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthService(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder){

        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void register(RegisterRequest request){

        if (userRepository.existsByEmail(request.getEmail())){
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    "This email has already been used to register"
            );
        }
        User user = new User();

        user.setFirstName(request.getFirstName());
        user.setSurname(request.getSurname());
        user.setEmail(request.getEmail());

        user.setPassword(
                passwordEncoder.encode(request.getPassword())
        );

        userRepository.save(user);
    }
}

