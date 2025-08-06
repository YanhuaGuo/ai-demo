package com.example.demo;

import com.example.demo.utils.SystemConfig;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j(topic = "gyh-test")
@SpringBootTest
class DemoApplicationTests {

    @Resource
    private SystemConfig systemConfig;

    @Test
    void contextLoads() {
        log.info(systemConfig.getApiKey());
        System.out.println(systemConfig.getApiKey());
    }

}
