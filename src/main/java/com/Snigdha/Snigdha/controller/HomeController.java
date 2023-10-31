package com.Snigdha.Snigdha.controller;

import com.Snigdha.Snigdha.dao.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private HomeRepository homeRepository;

    @GetMapping("/home")
    public String homePage() {
        homeRepository.createDatabase();
        return "home"; // Assuming "home" is the name of your home.html file
    }
}