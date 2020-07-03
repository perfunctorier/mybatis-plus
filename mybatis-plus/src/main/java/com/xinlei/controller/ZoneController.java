package com.xinlei.controller;

import ch.qos.logback.classic.Logger;
import com.xinlei.pojo.User;
import com.xinlei.service.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/zone")
public class ZoneController {
    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(ZoneController.class);

    @Autowired
    public UserService userService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public @ResponseBody
    ModelMap testJSP(@RequestParam Map<String,Object> parm){
        ModelMap map = new ModelMap();
        List<User> list = userService.getUserList();
        map.put("data",list);
        LOGGER.info("测试呢啊哈哈哈哈哈哈");
        return map;
    }

}
