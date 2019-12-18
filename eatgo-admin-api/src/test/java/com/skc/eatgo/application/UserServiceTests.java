package com.skc.eatgo.application;

import com.skc.eatgo.domain.CategoryRepository;
import com.skc.eatgo.domain.User;
import com.skc.eatgo.domain.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;

public class UserServiceTests {

    private UserService userService;

    @Mock
    private UserRepository userRepository;

    @Before
    public void serup() {
        MockitoAnnotations.initMocks(this);

        userService = new UserService(userRepository);
    }

    @Test
    public void getUsers() {
        List<User> mockUsers = new ArrayList<>();
        mockUsers.add(User.builder()
                .email("tester@example.com")
                .name("테스터")
                .level(1L)
                .build());

        given(userRepository.findAll()).willReturn(mockUsers);

        List<User> users = userService.getUsers();

        assertThat(users.get(0).getName(), is("테스터"));
    }

}