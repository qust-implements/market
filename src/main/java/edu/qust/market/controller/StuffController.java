package edu.qust.market.controller;


import edu.qust.market.bean.Stuff;
import edu.qust.market.bean.StuffExample;
import edu.qust.market.framework.bean.WebModel;
import edu.qust.market.framework.message.ErrorEnum;
import edu.qust.market.framework.message.Message;
import edu.qust.market.mapper.StuffMapper;
import edu.qust.market.service.StuffService;
import edu.qust.market.utils.FileUpload;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.rmi.MarshalException;
import java.util.List;

@RequestMapping("/stuff")
@RestController
public class StuffController {
    private static final Logger log = LoggerFactory.getLogger(StuffController.class);

    @Autowired
    private StuffService stuffService;

    @RequestMapping("/selectAll")
    public Message selectAll(WebModel webModel){
        try{
            stuffService.selectAll(webModel);
            return Message.createSuccessMessage(webModel);
        }catch (Exception e){
            e.printStackTrace();
            return Message.createFailureMessage(ErrorEnum.UnknowError);
        }
    }

    @RequestMapping("/selectStuffById")
    public Message selectStuffById(@RequestParam("id") Long id){
        try{
            Stuff stuff = stuffService.selectStuffById(id);
            return Message.createSuccessMessage(stuff);
        }catch (Exception e){
            e.printStackTrace();
            return Message.createFailureMessage(ErrorEnum.UnknowError);
        }
    }

    @RequestMapping("/selectStuffByCid")
    public Message selectStuffByCid(@RequestParam("cid") Long cid, WebModel webModel){
        try{
            stuffService.getStuffByCategory(cid,webModel);
            return Message.createSuccessMessage(webModel);
        }catch (Exception e){
            e.printStackTrace();
            return Message.createFailureMessage(ErrorEnum.UnknowError);
        }
    }

    @RequestMapping("/searchByKeyWords")
    public Message searchByKeyWords(@RequestParam("keyWords") String keyWords, WebModel webModel){
        try{
            stuffService.searchByKeyWords(keyWords,webModel);
            return Message.createSuccessMessage(webModel);
        }catch (Exception e){
            e.printStackTrace();
            return Message.createFailureMessage(ErrorEnum.UnknowError);
        }
    }

    @RequestMapping("/upload")
    public Message uploadFile(HttpServletRequest httpServletRequest){
        try{
            String url = FileUpload.savaFile(httpServletRequest);
            return Message.createSuccessMessage(url);
        }catch (Exception e){
            e.printStackTrace();
            return Message.createFailureMessage(ErrorEnum.UnknowError);
        }
    }
}
