package com.hand.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/8 17:33
 * @Description
 */
public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        //判断什么情况下登录
        if (request.getRequestURI().contains("goLogin")){
            return true;
        }

        if (request.getRequestURI().contains("login")){
            return true;
        }

        if (session.getAttribute("userLoginInfo") != null) {
            return true;
        }

        //判断什么情况下没有登录
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);

        return false;
    }
}
