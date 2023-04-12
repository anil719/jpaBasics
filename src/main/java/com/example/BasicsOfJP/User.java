package com.example.BasicsOfJP;


import jakarta.persistence.*;

@Entity
@Table(name="UserInfo")
public class User {


    @Id
    private int id;
    private String name;
    private int age;

    @OneToOne
    Card card;


    @Column(name = "mbType")
    private String mobile;

    public User() {
    }

    public User(int id, String name, int age, String mobile) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
