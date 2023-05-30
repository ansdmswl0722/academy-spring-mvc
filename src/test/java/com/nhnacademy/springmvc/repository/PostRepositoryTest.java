package com.nhnacademy.springmvc.repository;

import com.nhnacademy.springmvc.entity.Post;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PostRepositoryTest {

    @Autowired
    private PostRepository postRepository;

    @Test void test() {

        List<Post> post = postRepository.findByUser_UserIdLike("moon");
        assertThat(post).hasSize(1);
    }

}