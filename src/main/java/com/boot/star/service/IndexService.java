package com.boot.star.service;

import com.boot.star.mapper.SysRoleMapper;
import com.boot.star.mapper.TUserMapper;
import com.boot.star.model.SysRole;
import com.boot.star.model.TUser;
import com.boot.star.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class IndexService {

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private SysRoleMapper sysRoleMapper;
    @Autowired
    private TUserMapper tUserMapper;

    @Transactional//启动事务注解
    public TUser getUser(){
//        Object object = redisUtil.get("sysRole");
//        if(null==object){
//            object = tUserMapper.selectByPrimaryKey(1);
//            redisUtil.set("sysRole",object);
//        }
//        return (TUser) object;
        return tUserMapper.selectByPrimaryKey(1);
    }
}
