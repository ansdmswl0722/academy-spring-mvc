package com.nhnacademy.springmvc.repository;


import com.nhnacademy.springmvc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,String> {

    Boolean existsByUserId(String userId);


}
