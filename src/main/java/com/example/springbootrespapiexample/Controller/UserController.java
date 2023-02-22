package com.example.springbootrespapiexample.Controller;

import com.example.springbootrespapiexample.Model.User;
import com.example.springbootrespapiexample.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@Req
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getUserList")
    public List<User> getUser() {
        return userService.getUserList();
    }
}
