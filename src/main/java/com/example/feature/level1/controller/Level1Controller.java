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
    private static final String BASE_URL = "http://jsonplaceholder.typicode.com/posts/";
    /**
     * JSONPlaceholder usersのベースURL、IDなし
     */
    private static final String BASE_URL_2 = "http://jsonplaceholder.typicode.com/users/";
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
        final int RANDOM_ID = 1 + random.nextInt(100); // 1~100
        final String RANDOM_URL = BASE_URL + RANDOM_ID;

        final Posts P1 = restTemplate.getForObject(RANDOM_URL, Posts.class);
        model.addAttribute("pageTitle", "index page");
        model.addAttribute("url", RANDOM_URL);
        if (Objects.nonNull(P1)){
            model.addAttribute("post",P1);
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
        final int RANDOM_ID = 1 + random.nextInt(10); // 1~10
        String RANDOM_URL = BASE_URL_2 + RANDOM_ID;

        final Users U1 = restTemplate.getForObject(RANDOM_URL, Users.class);
        model.addAttribute("pageTitle", "another page");
        model.addAttribute("url", RANDOM_URL);
        if (Objects.nonNull(U1)) {
            model.addAttribute("user",U1);
        }
        return "another";
    }
}
