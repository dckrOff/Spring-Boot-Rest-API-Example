package com.example.springbootrespapiexample.Repository;

import com.example.springbootrespapiexample.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User getUserById(int id);
}
