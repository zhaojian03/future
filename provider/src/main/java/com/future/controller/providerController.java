package com.future.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/future")
public class providerController {

    @Value("${myName}")
    private String myNanme;

    @RequestMapping("/email")
    public String lai(){
        return "你好哦，邮件"+myNanme;
    }
}
