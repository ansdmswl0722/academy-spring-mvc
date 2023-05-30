package com.nhnacademy.springmvc.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;
    @Test
    void test() {
        Boolean result = userRepository.existsByUserId("moon");
        assertThat(result).isEqualTo(true);
    }
}