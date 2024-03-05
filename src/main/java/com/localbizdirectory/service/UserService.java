package com.localbizdirectory.service;

import com.localbizdirectory.entity.User;
import com.localbizdirectory.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;

    public Integer createUser(User user) {
        User savedUser = userRepo.save(user);
        return savedUser.getId();
    }

    public User findByUsername(String username) {
        return userRepo.findByUsername(username).orElse(null);
    }
}
