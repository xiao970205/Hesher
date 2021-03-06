package com.Hesher.service;

import com.Hesher.mapper.WechatgongMapper;
import com.Hesher.pojo.Wechatgong;
import com.Hesher.pojo.WechatgongExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeChatGongServiceImpl {
    @Autowired
    private WechatgongMapper wechatgongMapper;

    public int insert(Wechatgong record){
        return wechatgongMapper.insert(record);
    }

    public List<Wechatgong> selectByExampleWithBLOBs(WechatgongExample example){
        return wechatgongMapper.selectByExampleWithBLOBs(example);
    }
    
    public Wechatgong selectByPrimaryKey(String id) {
    	return wechatgongMapper.selectByPrimaryKey(id);
    }

}
