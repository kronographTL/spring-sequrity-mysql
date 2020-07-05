package com.kronographtl.springsequritymysql.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KronographResource {

    @GetMapping("/")
    public String kronographGuest(){
        return "Welcome Guest";
    }
    @GetMapping("/user")
    public String kronographUser(){
        return "Welcome User";
    }
    @GetMapping("/admin")
    public String kronographAdmin(){
        return "Welcome Admin";
    }
}
