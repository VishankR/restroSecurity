package com.swayambhu.restrosecurity.controllers;

import com.swayambhu.restrosecurity.entities.UserInfo;
import com.swayambhu.restrosecurity.services.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeResourceController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/")
    public String showHome(Model model){
        return "index";
    }

    @GetMapping("/signIn")
    public String logMeIn(Model model){
        model.addAttribute("msg", "msg");
        return "signIn";
    }

    @GetMapping("/signup")
    public String registerMe(){
        return "signUp";
    }

    @GetMapping("/signout")
    public String logMeOut(){
        return "signOut";
    }

    @GetMapping("/signinProcessing")
    public String processLogin(){
        return "signInProcessing";
    }

/*    @PostMapping("/base/addUser")
    public String adduser(@RequestBody UserInfo userInfo){
        System.out.println("Opens: ");
        this.getClass().getModule().getDescriptor().opens().stream().forEach(System.out::println);
        System.out.println("Exports: ");
        this.getClass().getModule().getDescriptor().exports().stream().forEach(System.out::println);
        userInfoService.addUser(userInfo);
        return "User Added";
    }*/
}
