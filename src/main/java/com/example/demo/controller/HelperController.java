package com.example.demo.controller;

import com.example.demo.ai.AiHealthService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description:
 * @author: yanhua.guo
 * @create: 2025-08-06 10:59
 **/
@RestController
@RequestMapping("/ai")
public class HelperController {

    @Resource
    private AiHealthService aiHealthService;


    @GetMapping("/test")
    public String getName(){
        return "hello world" + aiHealthService.chart("你好，我是java程序员andy");
    }

}