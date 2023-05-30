package com.nhnacademy.springmvc.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@ToString
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
@Table(name = "Board_Users")
public class User {
    @Id
    @Column(name = "user_id")
    private String userId;
    @Column(name = "password")
    private String password;
    private int age;
    private String name;
    private String profileFileName;
    @Column(name = "created_at")
    private LocalDateTime createdAt;;
    private String role;
    @OneToMany(mappedBy = "user")
    private List<Post> postList;







}
