package edu.qust.market.controller;

import edu.qust.market.framework.message.Message;
import edu.qust.market.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("collection")
public class CollectionComtroller {

    @Autowired
    private CollectionService collectionService;

//    @RequestMapping("selectUserCollection")
//    public Message selectUserCollection(String token){
//        try{
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
}
