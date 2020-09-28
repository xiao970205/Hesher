package com.Hesher.mapper;

import com.Hesher.pojo.LeftMenu;
import com.Hesher.pojo.LeftMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeftMenuMapper {
    long countByExample(LeftMenuExample example);

    int deleteByExample(LeftMenuExample example);

    int deleteByPrimaryKey(String id);

    int insert(LeftMenu record);

    int insertSelective(LeftMenu record);

    List<LeftMenu> selectByExample(LeftMenuExample example);

    LeftMenu selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LeftMenu record, @Param("example") LeftMenuExample example);

    int updateByExample(@Param("record") LeftMenu record, @Param("example") LeftMenuExample example);

    int updateByPrimaryKeySelective(LeftMenu record);

    int updateByPrimaryKey(LeftMenu record);
}