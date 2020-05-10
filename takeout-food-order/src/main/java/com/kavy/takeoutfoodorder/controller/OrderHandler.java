package com.kavy.takeoutfoodorder.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@RefreshScope
public class OrderHandler {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/index")
    public String index(){

        return "order的端口"+this.port;
    }

    @RequestMapping("/test")
    public String test(){

        return "你好呀";
    }
}
