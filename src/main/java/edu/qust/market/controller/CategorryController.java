package edu.qust.market.controller;

import edu.qust.market.bean.Category;
import edu.qust.market.framework.message.ErrorEnum;
import edu.qust.market.framework.message.Message;
import edu.qust.market.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/category")
@RestController
public class CategorryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/getCategory")
    public Message getCategory(){
        try{
            List<Category> data = categoryService.getCategory();
            return Message.createSuccessMessage(data);
        }catch (Exception e){
            return Message.createFailureMessage(ErrorEnum.UnknowError);
        }
    }
}
