package com.nhnacademy.springmvc.repository;


import com.nhnacademy.springmvc.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;


public interface PostRepository extends JpaRepository<Post,Long> {
    List<Post> findByUser_UserIdLike(String userId);
}
