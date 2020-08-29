package com.example.feature.level1.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * JSONPlaceholderのpostsをバインドするクラス
 * @see <a href="http://jsonplaceholder.typicode.com/posts">JSONPlaceholder posts</a>
 */

@NoArgsConstructor
@Getter
@Setter
public class Post {
    private Integer userId;
    private Integer id;
    private String title;
    private String body;
}