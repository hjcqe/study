package com.boot.star.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class RedisUtil {

    @Autowired
    private static RedisTemplate<Object,Object> redisTemplate;

    private RedisSerializer redisSerializer = new StringRedisSerializer();

    public void set(final String key,final Object value){
        redisTemplate.setKeySerializer(redisSerializer);
        if(!StringUtils.isEmpty(key)&&null!=value){
            redisTemplate.opsForValue().set(key,value);
        }
    }

    public void set(final String key,final Object value,final long time){
        redisTemplate.setKeySerializer(redisSerializer);
        if(!StringUtils.isEmpty(key)&&null!=value){
            redisTemplate.opsForValue().set(key,value,time);
        }
    }

    public Object get(final String key){
        Object object = null;
        if(!StringUtils.isEmpty(key)){
            object = redisTemplate.opsForValue().get(key);
        }
        return object;
    }
}
