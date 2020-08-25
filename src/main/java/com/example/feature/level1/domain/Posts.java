package com.example.feature.level1.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// http://jsonplaceholder.typicode.com/posts

@NoArgsConstructor
@Getter
@Setter
public class Posts {
    private Integer userId;
    private Integer id;
    private String title;
    private String body;
}