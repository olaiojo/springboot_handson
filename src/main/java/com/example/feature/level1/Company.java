package com.example.feature.level1;

public class Company {
    private String name;
    private String catchPhrase;
    private String bs;

    // Constructor
    public Company(){
    }

    // Setter
    public String getName(){
        return this.name;
    }

    public String getCatchPhrase(){
        return this.catchPhrase;
    }

    public String getBs(){
        return this.bs;
    }

    // Getter
    public void setName(String name){
        this.name = name;
    }

    public void setCatchPhrase(String catchPhrase){
        this.catchPhrase = catchPhrase;
    }

    public void setBs(String bs){
        this.bs = bs;
    }

}
