package com.example.feature.level1.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * JSONPlaceholderのUsersの入れ子構造用のクラス
 * @see <a href="https://jsonplaceholder.typicode.com/users">JSONPlaceholder users</a>
 */

@Setter
@NoArgsConstructor
@Getter
public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;
}
