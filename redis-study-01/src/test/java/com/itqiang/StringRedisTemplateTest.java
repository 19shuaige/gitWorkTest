package com.itqiang;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itqiang.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 *
 * 
 * @author 伤口化作剑刃
 * @date 2025/4/9 15:06
 */
@SpringBootTest
public class StringRedisTemplateTest {

    @Autowired
    private StringRedisTemplate redisTemplate;


    private ObjectMapper objectMapper=new ObjectMapper();

    @Test
    void test(){
        redisTemplate.opsForHash().put("user:100","1","2");
        Object o = redisTemplate.opsForHash().get("user:100", "1");
        System.out.println(o.getClass());
        System.out.println("o = " + o);

    }

    @Test
    void test2() throws JsonProcessingException {
        User user = new User("name", "password", 20);

        // 手动序列化
        String object = objectMapper.writeValueAsString(user);

        //
        redisTemplate.opsForHash().put("user:200","2",object);


        String o = (String) redisTemplate.opsForHash().get("user:200", "2");

        // 手动反序列化
        User user1 = objectMapper.readValue(o, User.class);

        System.out.println("user1 = " + user1);
    }


    @Test
    void test3(){
        ListOperations<String, String> listOperations = redisTemplate.opsForList();

//        listOperations.leftPush("list:1","1");
//        listOperations.leftPush("list:1","2");

        System.out.println("listOperations.size(\"list:1\") = " + listOperations.size("list:1"));
    }



    @Test
    void test4(){
        redisTemplate.opsForSet().add("set:1","2","2","3");

//        redisTemplate.delete()

        System.out.println("redisTemplate.opsForSet().size(\"set:1\") = " + redisTemplate.opsForSet().size("set:1"));
    }


}
