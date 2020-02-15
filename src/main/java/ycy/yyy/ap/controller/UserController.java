package ycy.yyy.ap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ycy.yyy.ap.service.UserService;

import java.util.List;
import java.util.Map;

@RestController   //本类所有方法均返回json格式
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/buy")
    public String hello(){
        System.out.println("Spring cloud 产品提供者");
        return "购买一个产品（产品提供者）";
    }

    @RequestMapping("/search")
    public List<Map> search(){
        return userService.search();
    }

}
