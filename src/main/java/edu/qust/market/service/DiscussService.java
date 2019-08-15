package edu.qust.market.service;

import edu.qust.market.bean.Discuss;
import edu.qust.market.bean.DiscussExample;
import edu.qust.market.bean.User;
import edu.qust.market.framework.bean.WebModel;
import edu.qust.market.mapper.DiscussMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussService {

    @Autowired
    private DiscussMapper discussMapper;

    public int insertDiscuss(Discuss discuss){
        return discussMapper.insertSelective(discuss);
    }

    public void selectDiscussByStuffId(Long sid,WebModel webModel){
        DiscussExample discussExample = new DiscussExample();
        discussExample.setLimitStart(webModel.getLimitStart());
        discussExample.setPageSize(webModel.getPs());
        DiscussExample.Criteria dec = discussExample.createCriteria();
        dec.andStuffIdEqualTo(sid);
        int count = discussMapper.countByExample(discussExample);
        List<Discuss> data  = discussMapper.selectByExample(discussExample);
        webModel.setTotalCount(count);
        webModel.setData(data);
    }

    public void selectDiscussByUserId(Long uid, WebModel webModel){
        DiscussExample discussExample = new DiscussExample();
        discussExample.setLimitStart(webModel.getLimitStart());
        discussExample.setPageSize(webModel.getPs());
        DiscussExample.Criteria dec = discussExample.createCriteria();
        dec.andUserIdEqualTo(uid);
        int count = discussMapper.countByExample(discussExample);
        List<Discuss> data = discussMapper.selectByExample(discussExample);
        webModel.setTotalCount(count);
        webModel.setData(data);
    }
}
