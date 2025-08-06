package com.example.demo.service;

import dev.langchain4j.service.SystemMessage;

/**
 * @program: demo
 * @description:
 * @author: yanhua.guo
 * @create: 2025-08-06 16:19
 **/
public interface AIDoctorService {

    @SystemMessage(fromResource = "system-prompts.txt")
    String chat(String userMessage);
}
