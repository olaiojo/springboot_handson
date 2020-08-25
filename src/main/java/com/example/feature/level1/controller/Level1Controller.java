package com.example.feature.level1.controller;

import com.example.feature.level1.domain.Posts;
import com.example.feature.level1.domain.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import java.util.Random;
import java.util.Objects;

@Controller
public class Level1Controller {
    private static final RestTemplate restTemplate = new RestTemplate();
    // ベースのURL
    private static final String baseUrl = "http://jsonplaceholder.typicode.com/posts/";
    private static final String baseUrl2 = "http://jsonplaceholder.typicode.com/users/";
    // IDのランダム変更用
    Random random = new Random();

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        //ランダムなpost IDをURLに付加
        int randomId = 1 + random.nextInt(100); // 1~100
        String randomUrl = baseUrl + randomId;

        Posts p1 = restTemplate.getForObject(randomUrl, Posts.class);
        model.addAttribute("pageTitle", "index page");
        model.addAttribute("url", randomUrl);
        if (!Objects.equals(p1, null)) {
            model.addAttribute("post", p1);
        }
        return "index";
    }

    @RequestMapping(value = "/another", method = RequestMethod.GET)
    public String another(Model model) {
        //ランダムなIDをURLに付加
        int randomId = 1 + random.nextInt(10); // 1~10
        String randomUrl = baseUrl2 + randomId;

        Users u1 = restTemplate.getForObject(randomUrl, Users.class);
        model.addAttribute("pageTitle", "another page");
        model.addAttribute("url", randomUrl);
        if (!Objects.equals(u1, null)) {
            model.addAttribute("user",u1);
        }
        return "another";
    }
}
