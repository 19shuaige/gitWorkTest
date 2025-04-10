package com.itqiang.pojo;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.stream.Stream;

/**
 * 
 * 
 * @author 伤口化作剑刃
 * @date 2025/4/9 14:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private String password;
    private Integer age;
}
