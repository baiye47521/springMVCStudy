package com.hand.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/8 16:47
 * @Description
 */
@RestController
public class TestController {

    @GetMapping("/t1")
    public String test(){
        System.out.println("test()执行了");
        return "ok";
    }
}
