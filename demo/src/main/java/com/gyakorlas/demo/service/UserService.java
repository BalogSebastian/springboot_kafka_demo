package com.gyakorlas.demo.service;

import com.gyakorlas.demo.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final List<UserDto> users = new ArrayList<>();
    private final UserProducer producer;

    public UserService(UserProducer producer){
        this.producer = producer;
    }

    public List<UserDto> getUsers(){
        return users;
    }

    public void createUser(UserDto user){
        users.add(user);
        producer.send(user);
    }

}
