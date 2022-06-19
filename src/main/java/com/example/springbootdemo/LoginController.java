package com.example.springbootdemo;

import Beans.UserBean;
import DataStructur.JsonResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author GYJ
 */
@RestController
@RequestMapping(value = "/Login",produces = "application/json; charset=UTF-8")
public class LoginController {

    @RequestMapping("/springboot")
    public int loginStatus(){
        System.out.println("You are logging");
        return 0;
    }

    @CrossOrigin(origins = {"*"})
    @RequestMapping("/user")
    public JsonResult<UserBean> getUser(){
        return new JsonResult<>( new UserBean("gyj","20201307","123456"));
    }

    @CrossOrigin(origins = {"*"})
    @RequestMapping("/userlist")
    public List<UserBean> getUserList(@RequestBody Map<String,Object> map){
        String username = map.get("username").toString();
        String password = map.get("password").toString();
        System.out.println("Username:"+username+"\n"+"Password:"+password);
        List<UserBean> userList = new ArrayList<>();
        userList.add( new UserBean("gyj","20201307","123456"));
        userList.add( new UserBean("gz","20201308","123456"));
        userList.add( new UserBean("dwy","20201303","123456"));
        userList.add( new UserBean("flz","20201305","123456"));
        userList.add( new UserBean("yzx","20201328","123456"));
        return userList;
    }
}
