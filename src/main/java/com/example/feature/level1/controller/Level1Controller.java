package com.example.feature.level1.controller;

import com.example.feature.level1.domain.Posts;
import com.example.feature.level1.domain.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;
import java.util.Random;

/**
 * Level1Applicationのコントローラクラス
 */

@Controller
public class Level1Controller {
    /**
     * RestTemplateオブジェクト
     */
    private static final RestTemplate restTemplate = new RestTemplate();
    /**
     * JSONPlaceholder postsのベースURL、IDなし
     */
    private static final String baseUrl = "http://jsonplaceholder.typicode.com/posts/";
    /**
     * JSONPlaceholder usersのベースURL、IDなし
     */
    private static final String baseUrl2 = "http://jsonplaceholder.typicode.com/users/";
    /**
     * URLにランダムでIDを付加する用のRandomオブジェクト
     */
    Random random = new Random();

    /**
     * /indexにGET要求があったときの動作
     * <a href="https://jsonplaceholder.typicode.com/posts">JSONPlaceholder posts</a>のURLに1~100までのランダムなIDを追加して1回GET、
     * 取得したJSONのデータをビューに渡す
     * @return "index"
     * @see <a href="https://jsonplaceholder.typicode.com/posts">JSONPlaceholder posts</a>
     */
    @GetMapping("/index")
    public String index(Model model) {
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

    /**
     * /anotherにGET要求があったときの動作
     * <a href="https://jsonplaceholder.typicode.com/users">JSONPlaceholder users</a>のURLに1~10までのランダムなIDを追加して1回GET、
     * 取得したJSONのデータをビューに渡す
     * @return "index"
     * @see <a href="https://jsonplaceholder.typicode.com/users">JSONPlaceholder users</a>
     */
    @GetMapping("/another")
    public String another(Model model) {
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
