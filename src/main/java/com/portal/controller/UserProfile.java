package com.portal.controller;

public class UserProfile {
    private int user_id;
    private String name;
    private String email;
    private int age;

    public UserProfile() {
    }

    public String getName(String name) {
        this.name = name;
        return name;
    }

    public String getEmail(String email) {
        this.email = email;
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
