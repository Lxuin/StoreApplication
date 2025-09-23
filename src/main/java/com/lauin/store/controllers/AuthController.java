package com.lauin.store.controllers;

import com.lauin.store.dtos.LoginUserRequest;
import com.lauin.store.repositories.UserRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/auth")
public class AuthController {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @PostMapping("/login")
    public ResponseEntity<Void> loginUser(
            @Valid @RequestBody LoginUserRequest request
    ) {
        var user = userRepository.findByEmail(request.getEmail()).orElse(null);
        if(user == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        if(!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        return ResponseEntity.ok().build();
    }
}
