package com.nhnacademy.springmvc.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Entity
@Getter
@Table(name = "Users")
public class User {
    @Id
    @Column(name = "user_id")
    private String userId;
    @Column(name = "password")
    private String password;
    @Column(name = "age")
    private int age;
    @Column(name = "name")
    private String name;
    private String img;
    @OneToMany(mappedBy = "user")
    private List<Post> postList;

    public User(String userId, String password, int age, String name ,String img) {
        this.userId = userId;
        this.password = password;
        this.age = age;
        this.name = name;
        this.img = img;
    }
}
