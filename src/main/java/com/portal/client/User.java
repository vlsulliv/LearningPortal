package com.portal.client;

import java.util.ArrayList;

public class User {
    public enum Sex { MALE, FEMALE }

    String name;
    String email;
    Sex gender;
    int id;

    User(String nameArg, String emailArg, Sex genderArg, int idArg) {
        name = nameArg;
        email = emailArg;
        gender = genderArg;
        id = idArg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static ArrayList<User> userList = new ArrayList<>();

   public void printUser() {
       System.out.println(this.name + ", " + getEmail());
   }

   public static void printUserList() {
       for (User p : userList) {
           System.out.println(p.getName());
       }
   }
}
