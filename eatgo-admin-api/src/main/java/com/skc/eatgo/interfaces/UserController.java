package com.skc.eatgo.interfaces;

import com.skc.eatgo.application.UserService;
import com.skc.eatgo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> list() {
        List<User> users = userService.getUsers();

        return users;
    }
    //1. User list
    //2. User creater -> 회원 가입
    //3. User update
    //4. User delete -> level: 0 => 아무 것도 못 함.
    // (1.: customer, 2: owener, 3: admin)
}
