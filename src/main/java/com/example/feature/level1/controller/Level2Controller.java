package com.example.feature.level1.controller;

import com.example.feature.level1.domain.Post;
import com.example.feature.level1.domain.PostRequestResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

/**
 * JSONPlaceholderのpostsにPOST送信し、返却された値をpost.htmlに表示させるクラス
 * @see <a href="https://jsonplaceholder.typicode.com/posts">JSONPlaceholder posts</a>
 */
@Controller
public class Level2Controller {
    //RestTemplateオブジェクト
    private static final RestTemplate restTemplate = new RestTemplate();

    //送信先URL
    private static final String URL = "http://jsonplaceholder.typicode.com/posts";

    @GetMapping("/post")
    public String response(Model model) {
        //送信するデータ、IDは自動割り振り
        final int USER_ID = 5;
        final String TITLE = "sample title";
        final String BODY = "sample body";

        //Builderを使用してPoseRequestResourceオブジェクトを生成
        final PostRequestResource request = PostRequestResource.builder()
                .userId(USER_ID)
                .title(TITLE)
                .body(BODY)
                .build();

        //requestをPOSTし、返却されたResponseBodyをPostクラスにバインド、Post型のresponseに格納
        final Post response = restTemplate.postForObject(URL, request, Post.class);

        //modelに追加
        model.addAttribute("pageTitle", "post page");
        model.addAttribute("url",URL);
        model.addAttribute("response", response);

        return "post";
    }
}
