package com.portal.model;

import java.util.ArrayList;

public class UserProfile {
    public String firstName;
    public String lastName;
    private String role;
    private int employeeId;

    UserProfile(String firstName, String lastName, String role) {

    }


    public int getAge() {
        if (age < 100) {
            this.age = age;
        } else {
            System.out.println("age is not valid, enter a integer smaller than 100");
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
