package com.hand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


/**
 * @Author L-ludongpeng
 * @Date 2020/12/8 17:18
 * @Description
 */
@Controller
@RequestMapping("/user")
public class LoginController {

    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @RequestMapping("/goLogin")
    public String login(){
        //把用户信息存在session中
        return "login";
    }

    @RequestMapping("/login")
    public String login(HttpSession session, String username, String password, Model model){
        //把用户信息存在session中
        session.setAttribute("userLoginInfo",username);
        model.addAttribute("username", username);
        return "main";
    }

    @RequestMapping("/goOut")
    public String goOut(HttpSession session){

        session.removeAttribute("userLoginInfo");
        return "main";
    }

}
