package com.boot.star.service;
/**
 * Created by hujichang on 2018/9/26.
 */

import com.boot.star.mapper.OpensaleHouseMapper;
import com.boot.star.mapper.TUserMapper;
import com.boot.star.model.OpensaleHouse;
import com.boot.star.model.TUser;
import com.boot.star.model.TUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author hujichang
 * @ClassName: UserService
 * @Description:
 * @date @create 2018年09月26 15:26
 */
@Service
public class UserService {
    @Autowired
    private TUserMapper tUserMapper;
    @Autowired
    private OpensaleHouseMapper opensaleHouseMapper;

    @Transactional
    public TUser getUserInfo(Integer id){
        return tUserMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public OpensaleHouse getHouseInfo(Integer id){
        return opensaleHouseMapper.selectByPrimaryKey(id);
    }

    public int addUser(TUser user) {
        return tUserMapper.insertSelective(user);
    }

    public int deleteUser(Integer id) {
        return tUserMapper.deleteByPrimaryKey(id);
    }

    public int updateUser(TUser user) {
        return tUserMapper.updateByPrimaryKeySelective(user);
    }

    public List<TUser> getUsers() {
        TUserExample ex = new TUserExample();
        return tUserMapper.selectByExample(ex);
    }
}
