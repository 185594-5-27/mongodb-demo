package com.shop.mongodbdemo.sys.controller;

import com.shop.mongodbdemo.sys.dao.UserDao;
import com.shop.mongodbdemo.sys.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public Map<String,Object> save(User user){
        Map<String,Object> result = new HashMap<String,Object>();
        userDao.saveUser(user);
        return result;
    }

    @RequestMapping(value = "/findUserByUserName",method = RequestMethod.POST)
    public Map<String,Object> findUserByUserName(String userName){
        Map<String,Object> result = new HashMap<String,Object>();
        User user = userDao.findUserByUserName(userName);
        result.put("user",user);
        return result;
    }

}
