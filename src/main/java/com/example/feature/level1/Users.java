package com.example.feature.level1;

//https://jsonplaceholder.typicode.com/users

public class Users {
    private int id;
    private String name;
    private String username; //userNameだと値が取れない
    private String email;
    private Address address;
    private String phone; //TODO: 型変えたほうがよいかも
    private String website;
    private Company company;

    // Constructor
    public Users(){
    }

    // Getter
    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getUsername(){
        return this.username;
    }

    public String getEmail(){
        return this.email;
    }

    public Address getAddress(){
        return this.address;
    }

    public String getPhone(){
        return this.phone;
    }

    public String getWebsite(){
        return this.website;
    }

    public Company getCompany(){
        return this.company;
    }

    // Setter
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setAddress(Address address){
        this.address = address;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public void setWebsite(String website){
        this.website = website;
    }

    public void setCompany(Company company){
        this.company = company;
    }

}
