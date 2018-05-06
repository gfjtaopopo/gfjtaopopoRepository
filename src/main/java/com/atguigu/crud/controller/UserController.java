package com.atguigu.crud.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.atguigu.crud.bean.User;
import com.atguigu.crud.service.UserService;

/**
 * 用户控制器
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	UserService userService;

    @RequestMapping("/view")
    public String view() {
        return "main/login";
    }

    @RequestMapping("/indexview")
    public String index() {
        return "main/index";
    }

    @RequestMapping(value = "/dologin", method = RequestMethod.POST)
    public ModelAndView doLogin(User user, HttpSession session, HttpServletRequest request) {
    	
        User user2 = userService.findByUserid(user.getUserid());
        
//        System.out.println(user.toString());
//        System.out.println(user2.toString());
        
        // 登录失败
        if (user2 == null || !user2.getPassword().equals(user.getPassword())) {

//        	return new ModelAndView("redirect:/login.jsp");
        	return new ModelAndView("login");
        	
        // 登录成功
        } else {
        	
            session.setAttribute("user", user2);
            
            ModelAndView retMap  = new ModelAndView();
            retMap.setViewName("welcome");
            return retMap ;
        }
    }
    // 返回页面 方法1
    @RequestMapping(value = "/login")
    public ModelAndView login(HttpServletRequest request) {

        ModelAndView retMap = new ModelAndView();
        retMap.setViewName("login");
       	return retMap;
       	// 或
//    	return new ModelAndView("login");
    }
    
    // 返回页面 方法2
/*    @RequestMapping(value = "/login")
    public String gotoLogin() {
    	// 直接以字符串返回jsp页面的值(login.jsp)
    	return "login";
    }*/
}