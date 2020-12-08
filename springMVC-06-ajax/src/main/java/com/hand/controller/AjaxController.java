package com.hand.controller;

import com.hand.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/8 14:28
 * @Description
 */
@RestController
public class AjaxController {

    @RequestMapping("/t1")
    public String test(){
        return "hand";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("name:"+name);
        if ("hand".equals(name)){
            response.getWriter().print("true");
        } else {
            response.getWriter().print("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2(){
        List<User> userList = new ArrayList<User>();

        userList.add(new User("hand",18,"男"));
        userList.add(new User("sohand",20,"女"));
        userList.add(new User("veryhand",18,"男"));

        return userList;

    }

    @RequestMapping("/a3")
    public String a3(String name,String pwd){
        String msg = "";
        if (name != null){
            //admin 应该在数据库中查
            if ("admin".equals(name)){
                msg = "ok";
            } else {
                msg = "用户名有误";
            }
        }

        if (pwd != null){
            //123456 应该在数据库中查
            if ("123456".equals(pwd)){
                msg = "ok";
            } else {
                msg = "密码有误";
            }
        }
        return msg;
    }

}
