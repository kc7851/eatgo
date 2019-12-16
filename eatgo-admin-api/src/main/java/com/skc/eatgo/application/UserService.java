package com.skc.eatgo.application;

import com.skc.eatgo.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<User> getUsers() {


        return users;
    }
}
