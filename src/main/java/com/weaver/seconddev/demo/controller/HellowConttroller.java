package com.weaver.seconddev.demo.controller;
import com.weaver.common.authority.annotation.WeaPermission;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/secondev/demo")
@WeaPermission(publicPermission = true)
public class HellowConttroller {
    @GetMapping("/hello")
    public String hello(@RequestParam("msg") String msg) {
        return "Hello, " + msg;
    }
}

