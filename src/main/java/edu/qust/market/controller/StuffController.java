package edu.qust.market.controller;


import edu.qust.market.bean.Stuff;
import edu.qust.market.bean.StuffExample;
import edu.qust.market.framework.bean.WebModel;
import edu.qust.market.framework.message.ErrorEnum;
import edu.qust.market.framework.message.Message;
import edu.qust.market.mapper.StuffMapper;
import edu.qust.market.service.StuffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.rmi.MarshalException;
import java.util.List;

@RequestMapping("/stuff")
@RestController
public class StuffController {

    @Autowired
    private StuffService stuffService;

    @RequestMapping("/getStuff")
    public Message getStuff(WebModel webModel){
        try{
            stuffService.selectStuff(webModel);
            return Message.createSuccessMessage(webModel);
        }catch (Exception e){
            e.printStackTrace();
            return Message.createFailureMessage(ErrorEnum.UnknowError);
        }
    }
}
