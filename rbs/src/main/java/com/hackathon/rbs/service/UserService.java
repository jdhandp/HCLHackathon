package com.hackathon.rbs.service;

import java.util.List;

import com.hackathon.rbs.model.User;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(long id);
}
