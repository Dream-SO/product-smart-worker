package com.dreamso.smartworker.controller;

import com.dreamso.smartworker.model.User;
import com.dreamso.smartworker.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    @ApiOperation(value = "Get all users.", notes = "Returns user list")
    public List<User> getUsers() {
        return userService.getUsers();
    }


    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Create a User resource.", notes = "Returns the User")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

}
