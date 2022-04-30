package com.nhnacademy.springmvc.controller;

import com.nhnacademy.springmvc.domain.User;
import com.nhnacademy.springmvc.domain.UserRegisterRequest;
import com.nhnacademy.springmvc.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(("/user/register"))
public class UserRegisterController {
    private final UserRepository userRepository;

    public UserRegisterController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // TODO #2: 사용자 등록 form 표시
    @GetMapping
    public String userRegisterForm() {
        return "userRegister";
    }

    // TODO #4: 사용자 등록 처리
    @PostMapping
    public ModelAndView registerUser(@ModelAttribute UserRegisterRequest userRequest) {
        User user = userRepository.addUser(userRequest.getId(), userRequest.getPassword(), userRequest.getAge());

        ModelAndView mav = new ModelAndView("userInfo");
        mav.addObject("user", User.constructPasswordMaskedUser(user));

        return mav;
    }

}