package edu.qust.market.controller;

import edu.qust.market.bean.File_form;
import edu.qust.market.framework.message.ErrorEnum;
import edu.qust.market.framework.message.Message;
import edu.qust.market.service.FileFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FileFormService fileFormService;

    @RequestMapping("/getFileByTableId")
    public Message getFileByTableId(@RequestParam("id") int id){
        try{
            List<File_form> fileList = fileFormService.selectStuffImgByTableId(id);
            return Message.createSuccessMessage(fileList);
        }catch (Exception e){
            e.printStackTrace();
            return Message.createFailureMessage(ErrorEnum.UnknowError);
        }
    }
}
