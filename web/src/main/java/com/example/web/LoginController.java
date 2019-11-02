package com.example.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    private static final Logger logger=LoggerFactory.getLogger(LoginController.class);
    @RequestMapping(value = "/submit",method = RequestMethod.POST)
    public String login(String user,String password){
        logger.info("user"+user+"password:"+password);
        return "index";
    }
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login/login";
    }
}
