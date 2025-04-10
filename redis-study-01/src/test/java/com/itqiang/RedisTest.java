package com.itqiang;

import com.itqiang.jedis.util.JedisConnectFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

/**
 *
 * 
 * @author 伤口化作剑刃
 * @date 2025/4/8 20:15
 */
public class RedisTest {
    private Jedis jedis;

    @BeforeEach
    void start(){
        jedis= JedisConnectFactory.getJedis();
    }

    @Test
    void test() throws InterruptedException {
        String result = jedis.setex("hmall:user:4", 20, "设置成功了");
        System.out.println("result = " + result);
        long sadd = jedis.sadd("hmall:set:1", "3", "2");
        System.out.println("sadd = " + sadd);
    }


    @AfterEach
    void close(){
        jedis.close();
    }
}
