package com.xieyuhui.mongo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: xieyuhui
 * @Date: 2019-01-18 14:35
 * @Description:
 */
@RestController
public class IndexController {

    @Value("${spring.profiles}")
    private String message;

    @RequestMapping("/")
    public String index() {
        return message;
    }
}
