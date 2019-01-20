package com.xieyuhui.elasticsearch.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: xieyuhui
 * @Date: 2019-01-20 10:51
 * @Description:
 */
@RestController
public class IndexController {

    @Value("${project.info}")
    private String message;

    @RequestMapping("/")
    public String index() {
        return message;
    }
}
