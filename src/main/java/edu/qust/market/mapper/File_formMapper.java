package edu.qust.market.mapper;

import edu.qust.market.bean.File_form;
import edu.qust.market.bean.File_formExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface File_formMapper {
    int countByExample(File_formExample example);

    int deleteByExample(File_formExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(File_form record);

    int insertSelective(File_form record);

    List<File_form> selectByExample(File_formExample example);

    File_form selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") File_form record, @Param("example") File_formExample example);

    int updateByExample(@Param("record") File_form record, @Param("example") File_formExample example);

    int updateByPrimaryKeySelective(File_form record);

    int updateByPrimaryKey(File_form record);
}