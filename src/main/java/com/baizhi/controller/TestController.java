package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * Created by jia on 2018/10/17.
 */
@Controller
public class TestController {
    Logger logger=LoggerFactory.getLogger(TestController.class);
    @Autowired
    //service层啊啊
    private UserService service;
    @RequestMapping("/test")
    public String test(){

        return "你想干什么";
    }

    @RequestMapping("/selectAll")
    public String selectAll(Map map){
        List<User>list=service.selectAll();
        logger.debug("debug+++");
        map.put("list",list);
        return "index";
    }
}
