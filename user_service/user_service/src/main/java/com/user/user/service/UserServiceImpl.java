package com.user.user.service;

import com.user.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    //Load from database next step

    List<User> list = List.of(
            new User(1311L,"Vidya","234567865"),
            new User(1312L,"Divya","234567869"),
            new User(1313L,"Deepu","234567866")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
