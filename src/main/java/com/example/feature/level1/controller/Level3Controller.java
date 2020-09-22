package com.example.feature.level1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * otherページへのルーティングを行うコントローラクラス
 */
@Controller
public class Level3Controller {

    @GetMapping("/other")
    public String other(Model model){
        model.addAttribute("pageTitle", "Other page");
        return "other";
    }
}
