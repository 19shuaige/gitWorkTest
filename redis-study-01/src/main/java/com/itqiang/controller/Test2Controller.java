package com.itqiang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * 
 * @author 伤口化作剑刃
 * @date 2025/4/10 14:42
 */
@RequestMapping("/test2")
@RestController
public class Test2Controller {

    @GetMapping
    public String test2(){
        return "test3";
    }

    @GetMapping
    public String test23(){
        return "test3";
    }
}
