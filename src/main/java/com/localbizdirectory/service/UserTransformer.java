package com.localbizdirectory.service;

import com.localbizdirectory.dto.UserRequestDTO;
import com.localbizdirectory.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import static com.localbizdirectory.entity.Role.ADMIN;

@Component
@RequiredArgsConstructor
public class UserTransformer {
    private final PasswordEncoder passwordEncoder;

    public User transform(UserRequestDTO userRequestDTO) {
        User user = new User();
        user.setForename(userRequestDTO.getForename());
        user.setSurname(userRequestDTO.getSurname());
        user.setUsername(userRequestDTO.getUsername());
        user.setPassword(passwordEncoder.encode(userRequestDTO.getPassword()));
        user.setRole(ADMIN);
        return user;
    }
}
