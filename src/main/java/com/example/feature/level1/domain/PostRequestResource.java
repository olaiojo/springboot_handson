package com.example.feature.level1.domain;

import lombok.*;

@Builder
@Getter
@Setter
public class PostRequestResource {
    private Integer userId;
    private Integer id;
    private String title;
    private String body;
}