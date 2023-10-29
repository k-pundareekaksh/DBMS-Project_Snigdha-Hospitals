package com.Snigdha.Snigdha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/home")
    public String homePage() {
        String sql = "CREATE DATABASE IF NOT EXISTS Snigdha";
        jdbcTemplate.execute(sql);
        return "home"; // Assuming "home" is the name of your home.html file
    }
}