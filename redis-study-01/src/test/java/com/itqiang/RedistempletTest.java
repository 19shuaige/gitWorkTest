package com.itqiang;

import com.itqiang.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * 
 * 
 * @author 伤口化作剑刃
 * @date 2025/4/9 13:34
 */
@SpringBootTest
public class RedistempletTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void test(){
        redisTemplate.opsForValue().set("user","nijia");
        System.out.println("redisTemplate.opsForValue().get(\"usr\") = " + redisTemplate.opsForValue().get("user"));
    }


    @Test
    void test2(){
        redisTemplate.opsForValue().set("user",new User("name","123321",999));
        User o = (User) redisTemplate.opsForValue().get("user");
        System.out.println("o = " + o);
    }
}
