package com.example.feature.level1.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * JSONPlaceholderのUsersの入れ子構造用のクラス
 * @see <a href="https://jsonplaceholder.typicode.com/users">JSONPlaceholder users</a>
 */

@Getter
@NoArgsConstructor
@Setter
public class Company {
    private String name;
    private String catchPhrase;
    private String bs;
}
