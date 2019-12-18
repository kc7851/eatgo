package com.skc.eatgo.application;

import com.skc.eatgo.domain.CategoryRepository;
import com.skc.eatgo.domain.User;
import com.skc.eatgo.domain.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        List<User> users = userRepository.findAll();

        return users;
    }

    public User addUser(String eamil, String name) {
        return null;
    }
}
