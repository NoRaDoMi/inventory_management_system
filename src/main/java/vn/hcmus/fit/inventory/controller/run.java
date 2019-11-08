package vn.hcmus.fit.inventory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Asus on 11/8/2019.
 */
@Controller
public class run {
    @GetMapping("/home")
    public  String homepage(){
        return "index";
    }
}
