package com.example.demo.dao;

import com.example.demo.bean.MainMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuDao {
    public List<MainMenu> getMenu();
}
