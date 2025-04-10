package com.itqiang.jedis.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.time.Duration;

/**
 * jedis连接池
 * 
 * @author 伤口化作剑刃
 * @date 2025/4/8 21:04
 */
public class JedisConnectFactory {

    private static JedisPool jedisPool;

    static {
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        // 设置最大连接
        poolConfig.setMaxTotal(8);
        // 最大空闲连接
        poolConfig.setMaxIdle(8);
        // 最小空闲连接
        poolConfig.setMinIdle(0);

        poolConfig.setMaxWaitMillis(1000L);

         jedisPool = new JedisPool(poolConfig, "192.168.60.131", 6379, 1000, "123321");
    }

    public static Jedis getJedis(){
        return jedisPool.getResource();
    }
}
