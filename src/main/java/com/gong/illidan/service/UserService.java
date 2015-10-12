/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gong.illidan.service;

import com.gong.illidan.dao.model.User;

/**
 *
 * @author gongbenkai
 */
public interface UserService {
     int addUser(User userToAdd);
     User getUser(int userId);
}
