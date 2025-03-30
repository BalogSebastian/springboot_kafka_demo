package com.gyakorlas.demo.controller;
import com.gyakorlas.demo.dto.UserDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController

{

    // UserService osztály injektálása konstruktoron keresztül
    private final UserService service;
    public  UserController(UserService service){
        this.service = service;
    }

    // Get /users -Visszadja az összes felhasználót json formátumba
    @GetMapping
    public List<Userdto> getAllUsers(){
        return service.getUsers();
    }

    //Post /users - Új felhasználó létrehozása JSON vagy XML body-val
    @PostMapping(consumes = {MediaTyped.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE })
    public void createUser(@RequestBody UserDto user){
        service.createUser(user);
    }
}
