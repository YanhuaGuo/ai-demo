package com.example.demo.service;

import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.service.AiServices;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: demo
 * @description:
 * @author: yanhua.guo
 * @create: 2025-08-06 16:22
 **/
@Configuration
public class AIDoctorServiceFactory {

    //千问模型
    @Resource
    private ChatModel qwenChatModel;

    //配置bean
    @Bean
    public AIDoctorService aiDoctorService() {
        ChatMemory chatMemory = MessageWindowChatMemory.withMaxMessages(10);

        return AiServices.builder(AIDoctorService.class)
                .chatModel(qwenChatModel)
                .chatMemory(chatMemory)//会话记忆
                .build();
    }

}