package edu.qust.market.controller;

import edu.qust.market.bean.Session;
import edu.qust.market.framework.bean.WebModel;
import edu.qust.market.framework.message.ErrorEnum;
import edu.qust.market.framework.message.Message;
import edu.qust.market.service.SessionService;
import edu.qust.market.service.StuffService;
import edu.qust.market.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UerController {

    @Autowired
    private UserService userService;
    @Autowired
    private SessionService sessionService;
    @Autowired
    private StuffService stuffService;

    @RequestMapping("getUserStuff")
    public Message getUserStuff(@RequestParam("token") String token, WebModel webModel){
        try{
            String openId = sessionService.selectSessionByToken(token).get(0).getId();
            int id = userService.selectIdByOpenId(openId).get(0).getId();
            stuffService.selectStuffByUid(id,webModel);
            return Message.createSuccessMessage(webModel);
        }catch (Exception e){
            e.printStackTrace();
            return Message.createFailureMessage(ErrorEnum.UnknowError);
        }
    }
}
