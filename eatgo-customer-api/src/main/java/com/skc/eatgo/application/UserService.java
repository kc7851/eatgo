package com.skc.eatgo.application;

import com.skc.eatgo.domain.User;
import com.skc.eatgo.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(String eamil, String name, String password) {
        User user = User.builder()
                .email(eamil)
                .name(name)
                .password(password)
                .build();

        userRepository.save(user);

        return user;
    }
}
