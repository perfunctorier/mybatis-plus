package com.xinlei.controller;

import ch.qos.logback.classic.Logger;
import com.xinlei.pojo.User;
import com.xinlei.service.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
/*@RequestMapping("/user")*/
public class ZoneController {
    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(ZoneController.class);

    @Autowired
    public UserService userService;

    @RequestMapping(value = "/index1", method = RequestMethod.GET)
    public @ResponseBody ModelMap testJSP(@RequestParam Map<String,Object> parm){
        ModelMap map = new ModelMap();
        List<User> list = userService.getUserList();
        map.put("data",list);
        LOGGER.info("测试呢啊哈哈哈哈哈哈");
        return map;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public @ResponseBody String hello(@RequestParam Map<String,Object> parm){
        LOGGER.info("测试呢啊哈哈哈哈哈哈");
        return "hello,spring secrity!";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model){
        User user = userService.getUserById(1);
        model.addAttribute("user", user);
        return "index";
    }

    @RequestMapping({"/", "/index"})
    public String index(){
        return "index";
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/test")
    public String test(Model model, HttpServletRequest request) {
        User user = userService.getUserById(1);
        model.addAttribute("user", user);
        return "index";
    }
}
