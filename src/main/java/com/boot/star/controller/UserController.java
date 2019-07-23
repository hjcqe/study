package com.boot.star.controller;
/**
 * Created by hujichang on 2018/9/26.
 */


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.boot.star.model.OpensaleHouse;
import com.boot.star.model.TUser;
import com.boot.star.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @author hujichang
 * @ClassName: UserController
 * @Description:
 * @date @create 2018年09月26 15:07
 */
@Controller
@RequestMapping("/boot")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        TUser userInfo = userService.getUserInfo(1);
        return "hello world！！ "+ JSON.toJSONString(userInfo);
    }

    @GetMapping("/hello1")
    @ResponseBody
    public String hello1() {
        return "hello world 1 ！！";
    }

    @RequestMapping("/text/hei")
    public ModelAndView hei(){
        ModelAndView model = new ModelAndView();
        TUser userInfo = userService.getUserInfo(1);
        model.addObject("user",userInfo);
        model.setViewName("cart1");
        return model;
    }

    @RequestMapping("/interceptor/hei")
    public ModelAndView interceptor(){
        ModelAndView model = new ModelAndView();
        TUser userInfo = userService.getUserInfo(1);
        model.addObject("user",userInfo);
        model.setViewName("cart1");
        return model;
    }

    @RequestMapping("/forward")
    public String forword(){
        return "forward:/boot/interceptor/hei";
    }

    @RequestMapping("/redirect")
    public String redirect(){
        return "redirect:/boot/interceptor/hei";
    }

    @RequestMapping("/law/selectLawyer")
    @ResponseBody
    public JSONObject hel(String id) {
        JSONObject json = new JSONObject();
        try {
            TUser userInfo = userService.getUserInfo(Integer.valueOf(id));
            json.put("user",userInfo);
            json.put("result", "success");
        } catch (Exception e) {
            json.put("result", "操作异常，请联系管理员！");
            e.printStackTrace();
        }
        return json;
    }

    @RequestMapping("/house")
    public ModelAndView house(){
        ModelAndView model = new ModelAndView();
        OpensaleHouse houseInfo = userService.getHouseInfo(51869);
        model.addObject("house",houseInfo);
        model.setViewName("house");
        return model;
    }

    @RequestMapping("/logining")
    public String logining(){
        return "logining";
    }

    @RequestMapping("/login")
    public String login(HttpSession session){
        TUser userInfo = userService.getUserInfo(1);
        session.setAttribute("user",userInfo);
        return "login";
    }

    @RequestMapping("/error1")
    public String tip1(){
        return "error1";
    }

    @RequestMapping("/getUserInfo")
    @ResponseBody
    public String getUserInfo(String id){
        TUser userInfo = userService.getUserInfo(Integer.valueOf(id));
        JSONObject json = new JSONObject();
        json.put("resultCode",1);
        json.put("resultMsg","获取用户对象成功");
        json.put("data",userInfo);
        return JSON.toJSONString(json);
    }

    @RequestMapping("/getAllUsers")
    @ResponseBody
    public String getAllUsers(){
        JSONObject json = new JSONObject();
        List<TUser> users = userService.getUsers();
        json.put("resultCode",1);
        json.put("resultMsg","获取所有用户成功");
        json.put("data",users);
        return JSON.toJSONString(json);
    }

    @RequestMapping("/getUsers")
    public ModelAndView getUsers(){
        ModelAndView model = new ModelAndView();
        List<TUser> users = userService.getUsers();
        model.addObject("users",users);
        model.setViewName("cart");
        return model;
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add(String name){
        TUser user = new TUser();
        user.setName(name);
        int result = userService.addUser(user);
        if(result == 0){
            return "添加失败";
        }
        return "添加成功";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(String id){
        int result = userService.deleteUser(Integer.valueOf(id));
        if(result == 0){
            return "删除失败";
        }
        return "删除成功";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update(String id){
        TUser user = new TUser();
        user.setId(Integer.valueOf(id));
        user.setName("默认");
        int result = userService.updateUser(user);
        if(result == 0){
            return "修改失败";
        }
        return "修改成功";
    }

    @RequestMapping("/updateObj")
    @ResponseBody
    public String updateObj(String id){

        int result = 0;
        if(result == 0){
            return "修改失败";
        }
        return "修改成功";
    }

}
