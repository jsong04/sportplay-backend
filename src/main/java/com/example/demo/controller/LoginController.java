package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.dao.UserDao;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class LoginController {
    @Autowired
    UserDao userDao;

    @RequestMapping("/login")
    public String login(@RequestBody User user) {
        String flag = "error";
        User u = userDao.getUserByMessage(user.getUsername(), user.getPassword());
        System.out.println("User:" + u);
        HashMap<String, Object> res = new HashMap<>();
        if (u != null) {
            flag = "ok";
        }
        res.put("flag", flag);
        res.put("user", user);
        String res_json = JSON.toJSONString(res);

        return res_json;
    }
}
