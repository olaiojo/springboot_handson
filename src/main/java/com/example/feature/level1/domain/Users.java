package com.example.feature.level1.domain;

//https://jsonplaceholder.typicode.com/users

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Setter
public class Users {
    private Integer id;
    private String name;
    private String username; //userNameだと値が取れない
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;
}
