package com.boot.star.controller;

import com.boot.star.model.TUser;
import com.boot.star.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Value("${star.name}")
    private String name;

    @Value("${star.pass}")
    private String pass;

    @Autowired
    private IndexService indexService;


    @RequestMapping("/welcome")
    public  String index(Model model){
        System.out.println(1/0);
        TUser user = indexService.getUser();
        model.addAttribute("user",user);
        return "index";
    }

    @RequestMapping("/indexMsg")
    public String rfor(Model model){
        TUser sysRole = indexService.getUser();
        model.addAttribute("user",sysRole);
        return "index";
    }
}
