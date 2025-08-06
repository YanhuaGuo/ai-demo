package com.example.demo.ai;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AiHealthServiceTest {

    @Resource
    private AiHealthService aiHealthService;

    @Test
    void chart() {
        aiHealthService.chart("你好，我是java程序员andy");
    }
}