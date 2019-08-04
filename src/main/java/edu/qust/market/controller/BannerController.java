package edu.qust.market.controller;

import edu.qust.market.bean.Banner;
import edu.qust.market.framework.message.ErrorEnum;
import edu.qust.market.framework.message.Message;
import edu.qust.market.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/banner")
@RestController
public class BannerController {

    @Autowired
    private BannerService bannerService;

    @RequestMapping("/getBanner")
    public Message getBanner(){
        try{
        List<Banner> data = bannerService.getBanner();
            return Message.createSuccessMessage(data);
        }catch (Exception e){
            e.printStackTrace();
            return Message.createFailureMessage(ErrorEnum.UnknowError);
        }
    }
}
