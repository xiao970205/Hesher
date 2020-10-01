package com.Hesher.service;

import com.Hesher.mapper.VideoShowMapper;
import com.Hesher.pojo.VideoShow;
import com.Hesher.pojo.VideoShowExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoShowServiceImpl {
    @Autowired
    private VideoShowMapper videoShowMapper;

    public int insert(VideoShow videoShow){
        return videoShowMapper.insert(videoShow);
    }

    public List<VideoShow> selectByExample(VideoShowExample videoShowExample){
        return videoShowMapper.selectByExample(videoShowExample);
    }
}
