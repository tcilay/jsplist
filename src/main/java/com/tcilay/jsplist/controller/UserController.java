package com.tcilay.jsplist.controller;

import com.tcilay.jsplist.bean.Car;
import com.tcilay.jsplist.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tcilay
 * @create 2019-05-01 18:19
 */
@Controller
public class UserController {

    @RequestMapping("/index")
    public String get(Model model){
        model.addAttribute("user",userInstance());
        return "index";
    }

    @RequestMapping("/add")
    public String get(User user,Model model){
        System.out.println(user.toString());
        return "index";
    }

    private User userInstance(){
        List<Car> cars
                = new ArrayList<>();
        cars.add(new Car("奔驰","this is bc"));
        cars.add(new Car("宝马","this is bm"));
        cars.add(new Car("奥迪","this is ad"));
        User user = new User();
        user.setNames(cars);
        return user;
    }
}
