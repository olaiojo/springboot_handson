package com.example.feature.level1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class level1Controller {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("msg","this is message from controller");
        return "index";
    }

    @RequestMapping(value = "/another", method = RequestMethod.GET)
    public String another(Model model){
        return "another";
    }

    @RequestMapping(value = "/other", method = RequestMethod.GET)
    public String other(){
        return "other";
    }
}
