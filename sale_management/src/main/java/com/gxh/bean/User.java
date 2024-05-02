package com.gxh.bean;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String selfIntro;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", selfIntro='" + selfIntro + '\'' +
                '}';
    }

    public User(Integer id, String username, String password, String selfIntro) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.selfIntro = selfIntro;
    }

    public String getSelfIntro() {
        return selfIntro;
    }

    public void setSelfIntro(String selfIntro) {
        this.selfIntro = selfIntro;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }


}
