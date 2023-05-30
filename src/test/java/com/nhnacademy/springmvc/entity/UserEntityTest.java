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
public class UserEntityTest {

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void testUserEntity(){
        User user = entityManager.find(User.class,"user13");

        assertThat(ReflectionTestUtils.invokeGetterMethod(user,"userId")).isEqualTo("user13");
        assertThat(ReflectionTestUtils.invokeGetterMethod(user,"password")).isEqualTo("1234");
    }
}
