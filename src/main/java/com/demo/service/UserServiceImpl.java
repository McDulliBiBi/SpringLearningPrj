package com.demo.service;

import com.demo.dao.UserDAO;
import com.demo.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDAO userDAO;

    public List<User> findAll() {
        return userDAO.findAll();
    }
}
