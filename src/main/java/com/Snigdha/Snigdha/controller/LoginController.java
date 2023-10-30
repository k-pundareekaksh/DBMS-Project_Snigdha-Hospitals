package com.Snigdha.Snigdha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Snigdha.Snigdha.dao.LoginRepository;
import com.Snigdha.Snigdha.models.Login;


@Controller
public class LoginController {

    @Autowired
    LoginRepository loginRepository;

    @GetMapping(path = "/") // url path
    public String getLogin(Model model) {
        return "login"; // html page
    }

    @RequestMapping(value = "/addlogin", method = RequestMethod.POST)
    public String postLogin(Login login){
        if (loginRepository.Authentication(login))
        { 
            return "home";
        }
        return "login";
    }
    
}
