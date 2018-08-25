package com.yautumn.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.yautumn.entity.User;
import com.yautumn.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;
    
    @RequestMapping("/getlist")
    public String getUserList(){
    	Map<String,Object> map = new HashMap<>();
        List<User> list = userService.getUserList();
        List<Map<String,Object>> listUser =new ArrayList<Map<String,Object>>();
        Map<String,Object> mapUser = new HashMap<>(); 
        for(int i = 0 ; i<list.size();i++) {
        	int id = list.get(i).getId();
        	mapUser.put("id", id);
        	String username = list.get(i).getUserName();
        	mapUser.put("username", username);
        	String password = list.get(i).getPassword();
        	mapUser.put("password",password );
        	Date birthday = list.get(i).getBirthday();
        	mapUser.put("birthday",birthday);
        }
        listUser.add(mapUser);
        map.put("listUser", listUser);
//        return new Gson().toJson(list);
        return "getlist";
    }
    
    @RequestMapping("/getuserbyid")
    public String getUserById(int id){
        User user = userService.getUserById(id);
        return new Gson().toJson(user);
    }
    
    @RequestMapping("/getcount")
    public int getUserCount(){
        int count = userService.getCount();
        return count;
    }
    
    @RequestMapping("/deletebyid")
    public String deleteUserById(int id){
        boolean flg = userService.deleteUserById(id);
        if(flg == true){
            return "删除成功";
        }
        return "删除失败";
    }
    
    @RequestMapping("/insertuser")
    public String insertUser(){
        User user = new User();
        user.setUserName("kjlkd");
        user.setPassword("1234");
        boolean flg = userService.insertUser(user);
        if (flg == true){
            return "插入成功";
        }
        return "插入失败";
    }
}
