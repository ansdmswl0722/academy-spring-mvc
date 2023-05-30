package com.nhnacademy.springmvc.repository;

import com.nhnacademy.springmvc.config.RootConfig;
import com.nhnacademy.springmvc.config.WebConfig;
import com.nhnacademy.springmvc.entity.Post;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@WebAppConfiguration
@Transactional
@ContextHierarchy({
        @ContextConfiguration(classes = RootConfig.class),
        @ContextConfiguration(classes = WebConfig.class)
})
class PostRepositoryTest {

    @Autowired
    private PostRepository postRepository;

    @Test void test() {
        List<Post> post = postRepository.findByUser_UserIdLike("user13");
        assertThat(post).hasSize(2);
    }

}