package com.demo.dao;

import com.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDAO {
    public List<User> findAll();
}
