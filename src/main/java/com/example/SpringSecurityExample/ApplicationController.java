package com.example.SpringSecurityExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @GetMapping(value="/getMsg")
    public @ResponseBody String greeting1() {
        return "welcome to the spring security";
    }
}

