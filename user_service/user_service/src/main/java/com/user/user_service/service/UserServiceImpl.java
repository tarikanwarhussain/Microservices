package com.user.user_service.service;

import com.user.user_service.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    // Fake user List
    List<User> list = List.of(
            new User(1L, "Tarik", "12548963"),
            new User(2L, "Rajat", "12589634"),
            new User(3L, "Siraj", "3654789")

    );

    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }

}
