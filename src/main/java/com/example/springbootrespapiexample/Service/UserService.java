package com.example.springbootrespapiexample.Service;

import com.example.springbootrespapiexample.Entity.User;
import com.example.springbootrespapiexample.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    public List<User> usersList;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsersList() {
        return usersList;
    }

    public List<User> saveAllUsers(List<User> usersList) {
        return userRepository.saveAll(usersList);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }
}
