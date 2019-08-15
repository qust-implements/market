package edu.qust.market.controller;

import edu.qust.market.framework.bean.WebModel;
import edu.qust.market.framework.message.ErrorEnum;
import edu.qust.market.framework.message.Message;
import edu.qust.market.service.DiscussService;
import edu.qust.market.service.SessionService;
import edu.qust.market.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/discuss")
@RestController
public class DiscussController {

    @Autowired
    private DiscussService discussService;
    @Autowired
    private SessionService sessionService;
    @Autowired
    private UserService userService;

    @RequestMapping("/getDiscussByStuffId")
    public Message getDiscussByStuffId(@RequestParam("sid") Long sid, WebModel webModel){
        try{
            discussService.selectDiscussByStuffId(sid,webModel);
            return Message.createSuccessMessage(webModel);
        }catch (Exception e){
            e.printStackTrace();
            return Message.createFailureMessage(ErrorEnum.UnknowError);
        }
    }

    @RequestMapping("/getDiscussByUserId")
    public Message getDiscussByUSerId(@RequestParam("token") String token, WebModel webModel){
        try{
            String openid = sessionService.selectSessionByToken(token).get(0).getId();
            long id = userService.selectIdByOpenId(openid).get(0).getId();
            discussService.selectDiscussByUserId(id,webModel);
            return Message.createSuccessMessage(webModel);
        }catch (Exception e){
            e.printStackTrace();
            return Message.createFailureMessage(ErrorEnum.UnknowError);
        }
    }


}
