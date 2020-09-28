package com.Hesher.mapper;

import com.Hesher.pojo.Wechatgong;
import com.Hesher.pojo.WechatgongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WechatgongMapper {
    long countByExample(WechatgongExample example);

    int deleteByExample(WechatgongExample example);

    int deleteByPrimaryKey(String id);

    int insert(Wechatgong record);

    int insertSelective(Wechatgong record);

    List<Wechatgong> selectByExampleWithBLOBs(WechatgongExample example);

    List<Wechatgong> selectByExample(WechatgongExample example);

    Wechatgong selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Wechatgong record, @Param("example") WechatgongExample example);

    int updateByExampleWithBLOBs(@Param("record") Wechatgong record, @Param("example") WechatgongExample example);

    int updateByExample(@Param("record") Wechatgong record, @Param("example") WechatgongExample example);

    int updateByPrimaryKeySelective(Wechatgong record);

    int updateByPrimaryKeyWithBLOBs(Wechatgong record);

    int updateByPrimaryKey(Wechatgong record);
}