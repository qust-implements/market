package edu.qust.market.service;

import edu.qust.market.bean.User;
import edu.qust.market.bean.UserExample;
import edu.qust.market.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public int insertUser(User user){
        return userMapper.insertSelective(user);
    }

    public int CountByOpenid(String openid){
        UserExample userExample = new UserExample();
        UserExample.Criteria uec = userExample.createCriteria();
        uec.andOpenidEqualTo(openid);
        return userMapper.countByExample(userExample);
    }

    public int updateUserByOpenid(User user){
        UserExample userExample = new UserExample();
        UserExample.Criteria uec = userExample.createCriteria();
        uec.andOpenidEqualTo(user.getOpenid());
        return userMapper.updateByExampleSelective(user,userExample);
    }

    public List<User> selectIdByOpenId(String openId){
        UserExample userExample = new UserExample();
        UserExample.Criteria uec = userExample.createCriteria();
        uec.andOpenidEqualTo(openId);
        return userMapper.selectByExample(userExample);
    }
}
