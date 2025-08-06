package com.example.demo.service;

import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.chat.response.ChatResponse;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @program: demo
 * @description:
 * @author: yanhua.guo
 * @create: 2025-08-06 13:30
 **/
@Slf4j
@Service
public class AiHealthService {

    @Resource
    private ChatModel qwenChatModel;

    //简单聊天
    public String chart(String message){
        //封装消息
        UserMessage userMessage = UserMessage.from(message);
        //调用
        ChatResponse chatResponse =qwenChatModel.chat(userMessage);
        AiMessage aiMessage = chatResponse.aiMessage();

        log.info(aiMessage.toString());
        return aiMessage.text();
    }

    //多模态
    public String modalities(UserMessage userMessage){
        //调用
        ChatResponse chatResponse =qwenChatModel.chat(userMessage);
        AiMessage aiMessage = chatResponse.aiMessage();

        log.info(aiMessage.toString());
        return aiMessage.text();
    }
}