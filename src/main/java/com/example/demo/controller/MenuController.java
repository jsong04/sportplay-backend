package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.bean.MainMenu;
import com.example.demo.dao.MenuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class MenuController {

    @Autowired
    MenuDao menuDao;

    @RequestMapping("/menu")
    public String getAllMenu() {
        System.out.println("访问成功");
        HashMap<String, Object> data = new HashMap<>();
        List<MainMenu> menuList = menuDao.getMenu();
        if (menuList != null) {
            data.put("menuList", menuList);
            data.put("status", 200);
        } else {
            data.put("status", 404);
        }
        return JSON.toJSONString(data);
    }
}
