package com.hand.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.hand.pojo.User;
import com.hand.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/7 10:43
 * @Description
 */
@RestController
public class UserController {

    @RequestMapping("/j1")
//    @ResponseBody // 不走视图解析器，会直接返回一个字符串
    public String json1() throws JsonProcessingException {
        //jackson, objectMapper
        ObjectMapper mapper = new ObjectMapper();
        //创建一个对象
        User user = new User("鲁栋鹏1号", 3, "男");
        String str = mapper.writeValueAsString(user);
        return str;
    }

    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        List<User> userList = new ArrayList<User>();

        User user = new User("鲁栋鹏1号", 3, "男");
        User user2 = new User("鲁栋鹏2号", 3, "男");
        User user3 = new User("鲁栋鹏3号", 3, "男");
        User user4 = new User("鲁栋鹏4号", 3, "男");

        userList.add(user);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        String str = mapper.writeValueAsString(userList);
        return str;
    }

    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        Date date = new Date();

        //自定义日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String str = mapper.writeValueAsString(sdf.format(date));
        return str;
    }

    @RequestMapping("/j4")
    public String json4() throws JsonProcessingException {
        Date date = new Date();
        return JsonUtils.getJson(date, "yyyy-MM-dd HH:mm:ss");
    }

    @RequestMapping("/j5")
    public String json5() throws JsonProcessingException {

        List<User> userList = new ArrayList<User>();

        User user = new User("鲁栋鹏1号", 3, "男");
        User user2 = new User("鲁栋鹏2号", 3, "男");
        User user3 = new User("鲁栋鹏3号", 3, "男");
        User user4 = new User("鲁栋鹏4号", 3, "男");

        userList.add(user);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        String string = JSON.toJSONString(userList);
        return string;
    }
}
