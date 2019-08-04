package edu.qust.market.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import edu.qust.market.bean.File_formExample;
import edu.qust.market.bean.Stuff;
import edu.qust.market.bean.StuffExample;
import edu.qust.market.framework.bean.WebModel;
import edu.qust.market.framework.message.Message;
import edu.qust.market.mapper.File_formMapper;
import edu.qust.market.mapper.StuffMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StuffService {

    @Autowired
    private StuffMapper stuffMapper;
    @Autowired
    private File_formMapper file_formMapper;

    public void selectStuff(WebModel webModel){
        StuffExample stuffExample = new StuffExample();
        stuffExample.setLimitStart(webModel.getLimitStart());
        stuffExample.setPageSize(webModel.getPs());
        int count = stuffMapper.countByExample(stuffExample);
        webModel.setTotalCount(count);
        List<Stuff> list = stuffMapper.selectByExample(stuffExample);
        List<JSONObject> newlist = new ArrayList<>();
        for(Stuff s : list){
            File_formExample file_formExample = new File_formExample();
            file_formExample.setPageSize(1);
            File_formExample.Criteria fec = file_formExample.createCriteria();
            fec.andTableEqualTo("tb_stuff");
            fec.andTableIdEqualTo(s.getStuffId().intValue());
            JSONObject jo = (JSONObject) JSON.parse(JSONObject.toJSONString(s));
            jo.put("file",file_formMapper.selectByExample(file_formExample));
            newlist.add(jo);
        }
        webModel.setData(newlist);
    }
}
