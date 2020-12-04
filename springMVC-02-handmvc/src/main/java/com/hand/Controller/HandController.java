package com.hand.Controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/4 17:45
 * @Description
 */
public class HandController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();

        //业务代码
        String res = "HandSpringMVC";
        mv.addObject("msg", res);

        //视图跳转
        mv.setViewName("test");

        return mv;
    }
}
