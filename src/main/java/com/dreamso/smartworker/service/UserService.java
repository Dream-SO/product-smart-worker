package com.dreamso.smartworker.service;


import com.dreamso.smartworker.model.User;

import java.util.List;
import java.util.Optional;


public interface UserService {

    public List<User> getAllUsers();
    public User getUserById(long id);

    public User createUser(User user);
    public User updateUser(long id, User userRequest);
    public void deleteUser(long id);

}
