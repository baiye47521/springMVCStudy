package com.hand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author ludongpeng
 * @Date 2020/12/5 11:24
 * @Description:
 */
@Controller
public class ModelTest1 {

    @RequestMapping("/m1/t1")
    public String test1(Model model){

        //转发，写全路径，不需要试图解析器
        model.addAttribute("msg", "太帅");
//        return "/WEB-INF/jsp/test.jsp";
//        return "forward:WEB-INF/jsp/test.jsp";

        //重定向，不需要试图解析器
        return "redirect:/index.jsp";
    }
}
