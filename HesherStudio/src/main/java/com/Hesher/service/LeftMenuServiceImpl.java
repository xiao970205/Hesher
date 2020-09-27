package com.Hesher.service;

import com.Hesher.mapper.LeftMenuMapper;
import com.Hesher.pojo.LeftMenu;
import com.Hesher.pojo.LeftMenuExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeftMenuServiceImpl {
    @Autowired
    private LeftMenuMapper leftMenuMapper;

    public int insert(LeftMenu record) {
        return leftMenuMapper.insert(record);
    }

    public List<LeftMenu> selectByExample(LeftMenuExample example) {
        return leftMenuMapper.selectByExample(example);
    }
}
