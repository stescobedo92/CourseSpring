package com.edteam.course.controllers;

import com.edteam.course.models.User;
import org.springframework.web.bind.annotation.PathVariable;
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
        user.setName("Joe");
        user.setLastName("Wick");
        user.setEmail("anyemail@email.com");
        user.setPhone("55555");

        listUser.add(user);

        return listUser;
    }

    //Get user by id
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    User getUserById(@PathVariable long id){
        User user = new User();
        user.setName("Joe");
        user.setLastName("Wick");
        user.setEmail("anyemail@email.com");
        user.setPhone("55555");

        return user;
    }
}
