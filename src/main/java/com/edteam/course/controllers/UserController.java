package com.edteam.course.controllers;

import com.edteam.course.models.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    //GetAll users
    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<User> getAll(){
        List<User> listUser = new ArrayList<>();

        User user = new User();
        user.setName("Sergio");
        user.setLastName("Triana Escobedo");
        user.setEmail("stescobedo.31@gmail.com");
        user.setPhone("+5352019764");

        listUser.add(user);

        return listUser;
    }
}
