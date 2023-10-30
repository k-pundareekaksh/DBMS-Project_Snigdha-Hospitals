package com.Snigdha.Snigdha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Snigdha.Snigdha.models.Login;


@Controller
public class LoginController {

    @GetMapping(path = "/") // url path
    public String getLogin(Model model) {
        return "login"; // html page
    }

    @RequestMapping(value = "/addlogin", method = RequestMethod.POST)
    public String postLogin(Login login1){
        System.out.println(login1);
        if (login1.getUserName() == "username" && login1.getPassword() == "password")
        { 
            return "home";
        }
        return "login";
    }
    
}
