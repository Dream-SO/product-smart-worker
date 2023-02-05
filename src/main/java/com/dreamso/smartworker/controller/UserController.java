package com.dreamso.smartworker.controller;

import com.dreamso.smartworker.dto.UserDto;
import com.dreamso.smartworker.model.User;
import com.dreamso.smartworker.service.impl.UserServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/api/v1/")
public class UserController {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    UserServiceImpl userService;

    @GetMapping("/users")
    @ApiOperation(value = "Get all users.", notes = "Returns user list")
    public List<UserDto> getUsers() {
        return userService.getAllUsers().stream().map(user -> modelMapper.map(user, UserDto.class))
                .collect(Collectors.toList());
    }

    @GetMapping("/users/{id}")
    @ApiOperation(value = "Get user by Id.", notes = "Returns a user")
    public UserDto getUserById(@PathVariable(name = "id") Long id) {
        User user = userService.getUserById(id);
        // convert entity to DTO
        return modelMapper.map(user, UserDto.class);
    }


    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Create a User resource.", notes = "Returns the User")
    public UserDto createUser(@RequestBody User user) {
        User userObj = userService.createUser(user);
        return modelMapper.map(userObj, UserDto.class);
    }

    @PutMapping("/users/{id}")
    @ApiOperation(value = "Update user by Id.", notes = "update a user")
    public UserDto updateUser(@PathVariable(name = "id") Long id, @RequestBody User user) {
        User userObj = userService.updateUser(id, user);
        return modelMapper.map(userObj, UserDto.class);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable(name = "id") Long id) {
        userService.deleteUser(id);
    }

}
