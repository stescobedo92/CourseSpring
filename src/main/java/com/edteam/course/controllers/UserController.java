package com.edteam.course.controllers;

import com.edteam.course.models.User;
import com.edteam.course.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserRepository _userRepository;

    @PostMapping("/add")
    public String addUser(@RequestParam String name, @RequestParam String lastName,@RequestParam String email, @RequestParam String phone) {
        User user = new User();
        user.setName(name);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setPhone(phone);

        _userRepository.save(user);
        return "Added new user to repo!";
    }

    @GetMapping("/list")
    public Iterable<User> getUsers() {
        return _userRepository.findAll();
    }

    @GetMapping("/find/{id}")
    public User findUserById(@PathVariable Integer id) {
        return _userRepository.findUserById(id);
    }
}
