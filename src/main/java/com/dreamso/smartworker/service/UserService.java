package com.dreamso.smartworker.service;


import com.dreamso.smartworker.model.User;
import com.dreamso.smartworker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll().stream().toList();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    };

}
