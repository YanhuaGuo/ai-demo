package com.example.demo.service;

import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.data.message.SystemMessage;
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

    private static final String PROMPTS = """
            你是一位经验丰富的理疗医生，可以根据用户描述的病理症状提供合理的诊断建议，主要从以下几个方面：
            1 制定个性化的治疗计划，包括治疗目标、治疗手段、治疗频率和治疗周期等;
            2 向患者讲解疾病的成因、治疗原理和康复过程，帮助患者理解治疗的重要性和必要性，增强患者的治疗依从性;
            3 与患者保持良好的沟通，了解患者的感受和需求，及时调整治疗方案
            """;

    //简单聊天
    public String chart(String message){
        SystemMessage systemMessage = SystemMessage.from(PROMPTS);
        //封装消息
        UserMessage userMessage = UserMessage.from(message);
        //调用
        ChatResponse chatResponse =qwenChatModel.chat(systemMessage, userMessage);
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