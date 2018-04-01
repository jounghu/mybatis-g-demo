package com.edu.sdju.jounghu.mybatisgdemo.mapper;

import com.edu.sdju.jounghu.mybatisgdemo.MybatisGDemoApplicationTests;
import com.edu.sdju.jounghu.mybatisgdemo.domain.Student;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Copyright © 2018胡建松. All rights reserved.
 *
 * @Package: com.edu.sdju.jounghu.mybatisgdemo.mapper
 * @author: Jounghu
 * @date: 2018/4/1 11:24
 * @version: V1.0
 */
public class StudentMapperTest extends MybatisGDemoApplicationTests {

    @Autowired
    StudentMapper mapper;


    @Test
    public void deleteByPrimaryKey() throws Exception {
    }

    @Test
    public void insert() throws Exception {
    }

    @Test
    public void insertSelective() throws Exception {
    }

    @Test
    public void selectByPrimaryKey() throws Exception {
    }

    @Test
    public void updateByPrimaryKeySelective() throws Exception {
    }

    @Test
    public void updateByPrimaryKey() throws Exception {
    }

    @Test
    public void insertBatch() throws Exception {
    }

    @Test
    public void selectCount() throws Exception {
    }

    @Test
    public void selectBeans() throws Exception {
        List<Student> list = mapper.selectBeans(null);
    }

}