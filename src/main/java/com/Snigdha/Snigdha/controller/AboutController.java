package com.Snigdha.Snigdha.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String aboutUsPage() {
        return "aboutus";
    }
}
