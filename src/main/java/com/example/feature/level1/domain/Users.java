package com.example.feature.level1.domain;

//https://jsonplaceholder.typicode.com/users

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Setter
public class Users {
    private Integer id;
    private String name;
    @JsonProperty("username") //JsonPropertyで命名規則を変更してみる(username->userName)
    private String userName;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;
}
