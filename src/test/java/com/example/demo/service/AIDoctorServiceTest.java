package com.example.demo.service;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AIDoctorServiceTest {


    @Resource
    private AIDoctorService aiDoctorService;

    @Test
    void chat() {
        String chat = aiDoctorService.chat("你好，我是C#程序员andy，最近腿部不舒服，不知道是什么情况");
        System.out.println(chat);
    }
}