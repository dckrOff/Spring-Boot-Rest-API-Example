package com.example.springbootrespapiexample.Service;

import com.example.springbootrespapiexample.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        userList.add(new User(1, "Azamat", 20, "example@gmail.com"));
        userList.add(new User(2, "Azamat1", 20, "example@gmail.com"));
        userList.add(new User(3, "Azamat2", 20, "example@gmail.com"));
        userList.add(new User(4, "Azamat3", 20, "example@gmail.com"));
        userList.add(new User(5, "Azamat4", 20, "example@gmail.com"));
        userList.add(new User(6, "Azamat5", 20, "example@gmail.com"));
    }

    public List<User> getUserList() {
        return userList;
    }
}
