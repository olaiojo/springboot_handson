package com.example.feature.level1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Controller
public class level1Controller {

    private static final RestTemplate restTemplate = new RestTemplate();
    private static final String baseUrl = "http://jsonplaceholder.typicode.com/posts/";

    //IDのランダム変更用
    Random random = new Random();

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        //ランダムなpost IDをURLに付加
        int randomId = random.nextInt(100);
        String randomUrl = baseUrl+String.valueOf(randomId);

        Posts p1 = restTemplate.getForObject(randomUrl, Posts.class);
        model.addAttribute("pageTitle","index page");
        model.addAttribute("msg", "this is message from controller");
        model.addAttribute("url",randomUrl);
        model.addAttribute("userId",p1.getUserId());
        model.addAttribute("id",p1.getId());
        model.addAttribute("title",p1.getTitle());
        model.addAttribute("body",p1.getBody());
        return "index";
    }

    @RequestMapping(value = "/another", method = RequestMethod.GET)
    public String another(Model model) {
        //ランダムなpost IDをURLに付加
        int randomId = random.nextInt(100);
        String randomUrl = baseUrl+String.valueOf(randomId);

        Posts p2 = restTemplate.getForObject(randomUrl, Posts.class);
        model.addAttribute("pageTitle","another page");
        model.addAttribute("msg", "this is message from controller to another page");
        model.addAttribute("url",randomUrl);
        model.addAttribute("userId",p2.getUserId());
        model.addAttribute("id",p2.getId());
        model.addAttribute("title",p2.getTitle());
        model.addAttribute("body",p2.getBody());
        return "another";
    }
}
