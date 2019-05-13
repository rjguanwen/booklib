package cn.rjguanwen.booklib.controller;

import cn.rjguanwen.booklib.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @Author: 郑斌
 * @Date: 2019/3/22 9:16
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser/{id}")
    public String getUser(@PathVariable int id){
        return userService.sel(id).toString();
    }

    @RequestMapping("/getAllUser")
    public String getAll(){
        return userService.getAll().toString();
    }
}
