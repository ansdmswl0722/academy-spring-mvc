package com.nhnacademy.springmvc.entity;

import com.nhnacademy.springmvc.config.RootConfig;
import com.nhnacademy.springmvc.config.WebConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@WebAppConfiguration
@Transactional
@ContextHierarchy({
    @ContextConfiguration(classes = RootConfig.class),
    @ContextConfiguration(classes = WebConfig.class)
})
public class PostEntityTest {

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void testPostEntity() {
        Post post = entityManager.find(Post.class,1L);
        assertThat(post.getPostId().longValue()).isEqualTo(1L);

    }

}
