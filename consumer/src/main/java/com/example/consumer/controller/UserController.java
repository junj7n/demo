package com.example.consumer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.service.UserService;

@Controller
public class UserController {
    @Reference(version = "1.0.0")
    private UserService userService;

    @RequestMapping("/getuser")
    @ResponseBody
    public User getUser(){
          return   userService.getUser();
    }
}
