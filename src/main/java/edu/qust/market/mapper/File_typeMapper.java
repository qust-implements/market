package edu.qust.market.mapper;

import edu.qust.market.bean.File_type;
import edu.qust.market.bean.File_typeExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface File_typeMapper {
    int countByExample(File_typeExample example);

    int deleteByExample(File_typeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(File_type record);

    int insertSelective(File_type record);

    List<File_type> selectByExample(File_typeExample example);

    File_type selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") File_type record, @Param("example") File_typeExample example);

    int updateByExample(@Param("record") File_type record, @Param("example") File_typeExample example);

    int updateByPrimaryKeySelective(File_type record);

    int updateByPrimaryKey(File_type record);
}