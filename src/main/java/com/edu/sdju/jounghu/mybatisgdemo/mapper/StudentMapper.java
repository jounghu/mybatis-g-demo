package com.edu.sdju.jounghu.mybatisgdemo.mapper;

import com.edu.sdju.jounghu.mybatisgdemo.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    int insertBatch(List recordList);

    int selectCount(Map map);

    List selectBeans(Map map);
}