package com.itqiang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * 
 * @author 伤口化作剑刃
 * @date 2025/4/10 14:40
 */
@RequestMapping("/test1")
@RestController
public class Test1Controller {

    @GetMapping
    public String test1(){
        return "test1";
    }
}
