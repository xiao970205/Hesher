package com.Hesher.service;

import com.Hesher.mapper.TeacherMapper;
import com.Hesher.pojo.Teacher;
import com.Hesher.pojo.TeacherExample;
import com.Hesher.service.impl.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    public int insert(Teacher record){
        return teacherMapper.insert(record);
    }

    public List<Teacher> selectByExample(TeacherExample example){
        return teacherMapper.selectByExample(example);
    }

    public Teacher selectByPrimeKey(String primeKey){
        return teacherMapper.selectByPrimaryKey(primeKey);
    }

}
