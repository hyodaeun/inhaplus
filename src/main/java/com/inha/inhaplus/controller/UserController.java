package com.inha.inhaplus.controller;

import com.inha.inhaplus.entity.User;
import com.inha.inhaplus.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping(value = "/user")
    public List<User> getUser(@RequestParam(required = false, defaultValue = "") long id, String email) {
        return userService.getUserService(id, email);
    }

    @PostMapping(value = "/user")
    public String createUser(@RequestBody User user) {
        return userService.createUserService(user);
    }

}
