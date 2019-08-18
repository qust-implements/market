package edu.qust.market.service;

import edu.qust.market.bean.File_form;
import edu.qust.market.bean.File_formExample;
import edu.qust.market.mapper.File_formMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileFormService {

    @Autowired
    private File_formMapper file_formMapper;

    public List<File_form> selectStuffImgByTableId(int id){
        File_formExample file_formExample = new File_formExample();
        File_formExample.Criteria fec = file_formExample.createCriteria();
        fec.andTableIdEqualTo(id);
        return file_formMapper.selectByExample(file_formExample);
    }

    public int insertFile(File_form file_form){
        return file_formMapper.insertSelective(file_form);
    }
}
