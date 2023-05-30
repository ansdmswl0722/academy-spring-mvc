package com.nhnacademy.springmvc.entity;

import com.nhnacademy.springmvc.config.RootConfig;
import com.nhnacademy.springmvc.config.WebConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.util.ReflectionTestUtils;
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
public class EntityManagerTest {

    @PersistenceContext
    EntityManager entityManager;

    @Test
    void test1() {
        User user1 = new User("newUser","1234",30,"moon", "noImgPng");
        entityManager.persist(user1);
        entityManager.flush();

        User user2 = entityManager.find(User.class, "newUser");
        assertThat(user2).isEqualTo(user1);
    }

    @Test
    void test2() {
        Post post = entityManager.find(Post.class,1L);
        post.setContent("hi Moon");

        entityManager.flush();
        assertThat(ReflectionTestUtils.invokeGetterMethod(post,"content")).isEqualTo("hi Moon");
    }

}