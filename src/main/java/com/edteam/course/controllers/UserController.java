package com.edteam.course.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping(value = "/hellouser", method = RequestMethod.GET)
    String helloUser(){
        return "Hello user";
    }
}
