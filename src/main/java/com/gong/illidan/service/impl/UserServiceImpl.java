package com.gong.illidan.service.impl;

import com.gong.illidan.rest.controller.UserController;
import com.gong.illidan.dao.model.User;
import com.gong.illidan.dao.mapper.UserMapper;
import com.gong.illidan.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserServiceImpl implements UserService{
    
    private final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User userToAdd) {
        return userMapper.addUser(userToAdd);
    }

    @Override
    public User getUser(int userId) {
//        User user = new User("dude@dude.com1", "thedude1");
//        userMapper.addUser(user);
//        log.info("and user id {}", user.getId());
//        user = new User("dude@dude.com2", "thedude2");
//        userMapper.addUser(user);
//        log.info("and user id {}", user.getId());
        return userMapper.getUser(userId);
    }
}
