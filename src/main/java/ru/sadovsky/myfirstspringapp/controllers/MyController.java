package ru.sadovsky.myfirstspringapp.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.sadovsky.myfirstspringapp.models.LoginForm;
import ru.sadovsky.myfirstspringapp.models.LoginResponse;

@RestController
@RequestMapping(value = "/auth", produces = MediaType.APPLICATION_JSON_VALUE)
public class MyController {

    @GetMapping("/hello")
    public LoginResponse hello() {
        return new LoginResponse(200);
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginForm loginForm) {
        System.out.println(loginForm.getLogin());
        return new LoginResponse(200);
    }
}
