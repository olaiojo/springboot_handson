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

    // ベースのURL
    private static final String baseUrl = "http://jsonplaceholder.typicode.com/posts/";
    private static final String baseUrl2 = "http://jsonplaceholder.typicode.com/users/";

    // IDのランダム変更用
    Random random = new Random();

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        //ランダムなpost IDをURLに付加
        int randomId = 1 + random.nextInt(100);
        String randomUrl = baseUrl + String.valueOf(randomId);

        Posts p1 = restTemplate.getForObject(randomUrl, Posts.class);
        model.addAttribute("pageTitle", "index page");
        model.addAttribute("msg", "this is message from controller");
        model.addAttribute("url", randomUrl);
        model.addAttribute("userId", p1.getUserId());
        model.addAttribute("id", p1.getId());
        model.addAttribute("title", p1.getTitle());
        model.addAttribute("body", p1.getBody());
        return "index";
    }

    @RequestMapping(value = "/another", method = RequestMethod.GET)
    public String another(Model model) {
        //ランダムなIDをURLに付加
        int randomId = 1 + random.nextInt(10);
        String randomUrl = baseUrl2 + String.valueOf(randomId);

        Users u1 = restTemplate.getForObject(randomUrl, Users.class);
        model.addAttribute("pageTitle", "another page");
        model.addAttribute("msg", "this is message from controller");
        model.addAttribute("url",randomUrl);
        model.addAttribute("id", u1.getId());
        model.addAttribute("name", u1.getName());
        model.addAttribute("userName", u1.getUsername());
        model.addAttribute("lat", u1.getAddress().getGeo().getLat());
        model.addAttribute("lng", u1.getAddress().getGeo().getLng());
        return "another";
    }
}
