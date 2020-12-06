package com.hand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author ludongpeng
 * @Date 2020/12/5 09:55
 * @Description: 这个类会被spring接管，其中所有的方法，如果返回值是string，
 * 并且有具体的页面跳转，那么就会被视图解析器解析
 */
@Controller
public class ControllerTest2 {

    @RequestMapping("/t2")
    public String test1(Model model){
        model.addAttribute("msg", "ControllerTest2");

        return "test";
    }

    @RequestMapping("/t3")
    public String test3(Model model){
        model.addAttribute("msg", "ControllerTest3");

        return "test";
    }
}
