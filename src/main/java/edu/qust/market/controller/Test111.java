package edu.qust.market.controller;

import edu.qust.market.bean.Discuss;
import edu.qust.market.bean.Stuff;
import edu.qust.market.bean.User;
import edu.qust.market.bean.UserExample;
import edu.qust.market.mapper.DiscussMapper;
import edu.qust.market.mapper.StuffMapper;
import edu.qust.market.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Test111 {
    @Autowired
    private DiscussMapper discussMapper;

    public void slect() {
        Discuss discuss = new Discuss();
        discuss.setDiscussDesc("一个二手小灯还敢卖原价？");
        discuss.setUserId(Long.parseLong("2"));
        discuss.setStuffId(Long.parseLong("1"));
        discuss.setDiscussTime(Long.parseLong("0"));
        discussMapper.insertSelective(discuss);
    }

    public static void main(String[] args) {
        Test111 test111 = new Test111();
        for (int i = 0; i < 20; i++) {
            test111.slect();
        }
    }

}
