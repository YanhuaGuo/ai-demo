package com.example.demo.service;

import dev.langchain4j.data.message.ImageContent;
import dev.langchain4j.data.message.TextContent;
import dev.langchain4j.data.message.UserMessage;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileNotFoundException;

@SpringBootTest
class AiHealthServiceTest {

    @Resource
    private AiHealthService aiHealthService;

    @Test
    void chart() {
        aiHealthService.chart("你好，我是java程序员andy");
    }


    @Test
    void chartModalities() throws FileNotFoundException {
        //String imgPath =  ResourceUtils.getFile("classpath:bq.jpg").getPath();
        UserMessage userMessage = UserMessage.from(
                TextContent.from("请帮我解释这张图片"),
                //AudioContent.from()
                ImageContent.from("https://n.sinaimg.cn/sinakd20109/452/w1024h1028/20221120/1c15-fb3caaac078d102e219f8a61b154dc1c.jpg"));
        aiHealthService.modalities(userMessage);
    }
}