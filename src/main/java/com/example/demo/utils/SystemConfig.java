package com.example.demo.utils;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @program: demo
 * @description:
 * @author: yanhua.guo
 * @create: 2025-08-06 11:11
 **/
@Data
@Configuration
public class SystemConfig {

    @Value("${biz.apiKey}")
    String apiKey;
}