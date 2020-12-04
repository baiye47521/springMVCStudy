package com.hand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/4 18:28
 * @Description
 */
@Controller
public class HandController {

    @RequestMapping("/hand")
    public String hand(Model model){
        //封装数据
        model.addAttribute("msg", "Hand,SpringMVCAnnotation");

        //会被视图解析器处理 -> 定位到hand这个视图
        return "hand";
    }
}
