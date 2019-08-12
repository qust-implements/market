package edu.qust.market.mapper;

import edu.qust.market.bean.Session;
import edu.qust.market.bean.SessionExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SessionMapper {
    int countByExample(SessionExample example);

    int deleteByExample(SessionExample example);

    int deleteByPrimaryKey(String id);

    int insert(Session record);

    int insertSelective(Session record);

    List<Session> selectByExample(SessionExample example);

    Session selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Session record, @Param("example") SessionExample example);

    int updateByExample(@Param("record") Session record, @Param("example") SessionExample example);

    int updateByPrimaryKeySelective(Session record);

    int updateByPrimaryKey(Session record);
}