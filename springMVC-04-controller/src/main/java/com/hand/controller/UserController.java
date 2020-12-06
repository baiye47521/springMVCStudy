package com.hand.controller;

import com.hand.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author ludongpeng
 * @Date 2020/12/5 11:43
 * @Description:
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/t1")
    public String test1(@RequestParam("name") String name, Model model){
        //1.接受前端参数
        System.out.println("接受前端参数为："+name);
        //2.将返回结果传递给前端
        model.addAttribute("msg",name);
        //试图挑战
        return "test";
    }

    //前端传递的是一个对象：id   name    age
    @GetMapping("/t2")
    public String test2(User user){
        System.out.println(user);
        return "test";
    }

    @GetMapping("/t3")
    public String test3(ModelMap modelMap){
        return "test";
    }
}
