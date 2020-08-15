package com.example.feature.level1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class level1Controller {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/another")
    public String another(){
        return "another";
    }

    @RequestMapping("/other")
    public String other(){
        return "other";
    }
}
