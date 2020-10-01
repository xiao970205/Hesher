package com.Hesher.mapper;

import com.Hesher.pojo.VideoShow;
import com.Hesher.pojo.VideoShowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideoShowMapper {
    long countByExample(VideoShowExample example);

    int deleteByExample(VideoShowExample example);

    int deleteByPrimaryKey(String id);

    int insert(VideoShow record);

    int insertSelective(VideoShow record);

    List<VideoShow> selectByExample(VideoShowExample example);

    VideoShow selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") VideoShow record, @Param("example") VideoShowExample example);

    int updateByExample(@Param("record") VideoShow record, @Param("example") VideoShowExample example);

    int updateByPrimaryKeySelective(VideoShow record);

    int updateByPrimaryKey(VideoShow record);
}