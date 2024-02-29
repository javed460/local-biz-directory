package com.localbizdirectory.controller.admin;

import com.localbizdirectory.dto.UserRequestDTO;
import com.localbizdirectory.entity.User;
import com.localbizdirectory.service.UserService;
import com.localbizdirectory.service.UserTransformer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {
    private final UserService userService;
    private final UserTransformer userTransformer;

    @PostMapping("/user")
    public Integer createUser(@RequestBody UserRequestDTO userRequestDTO) {
        User user = userTransformer.transform(userRequestDTO);
        return userService.createUser(user);
    }


}
