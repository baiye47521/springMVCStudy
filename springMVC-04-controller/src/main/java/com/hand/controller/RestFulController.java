package com.hand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @Author ludongpeng
 * @Date 2020/12/5 10:38
 * @Description:
 */
@Controller
public class RestFulController {

    @RequestMapping(value = "/add/{a}/{b}", method = RequestMethod.GET)
    public String test1(@PathVariable int a,@PathVariable int b, Model model){
        int res = a+b;
        model.addAttribute("msg", "结果为"+res);

        return "test";
    }

    @PostMapping("/add/{a}/{b}")
    public String test3(@PathVariable int a,@PathVariable int b, Model model){
        int res = a+b;
        model.addAttribute("msg", "结果3为"+res);

        return "test";
    }

    @GetMapping("/add/{a}/{b}/{c}")
    public String test2(@PathVariable int a,@PathVariable int b,@PathVariable int c, Model model){
        int res = a+b+c;
        model.addAttribute("msg", "结果2为"+res);

        return "test";

        //重定向 ： 加个redirect
//        return "redirect:/index.jsp";
    }
}
