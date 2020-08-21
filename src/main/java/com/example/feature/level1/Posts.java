package com.example.feature.level1;

// http://jsonplaceholder.typicode.com/posts

public class Posts {
    private int userId;
    private int id;
    private String title;
    private String body;

//    Getter
    public int getUserId(){
        return this.userId;
    }

    public int getId(){
        return this.id;
    }

    public String getTitle(){
        return this.title;
    }

    public String getBody(){
        return this.body;
    }

//    Setter

    public void setUserId(int userId){
        this.userId = userId;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setBody(String body){
        this.body = body;
    }
}
