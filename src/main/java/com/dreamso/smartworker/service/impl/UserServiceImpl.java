package com.dreamso.smartworker.service.impl;

import com.dreamso.smartworker.exception.EntityNotFoundException;
import com.dreamso.smartworker.model.User;
import com.dreamso.smartworker.repository.UserRepository;
import com.dreamso.smartworker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll().stream().toList();
    }

    @Override
    public User getUserById(long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(User.class, "id", Long.toString(id)));
        return user;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    };

    @Override
    public User updateUser(long id, User userRequest) {
        User user = userRepository.findById(id)
                .orElseThrow(() ->new EntityNotFoundException(User.class, "id", Long.toString(id)));

        user.setFirstName(userRequest.getFirstName());
        user.setLastName(userRequest.getLastName());
        user.setEmail(userRequest.getEmail());
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(User.class, "id", Long.toString(id)));

        userRepository.delete(user);
    }
}
