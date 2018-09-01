package com.mike.pr.mapper;

import com.alibaba.fastjson.JSONArray;
import com.mike.pr.model.Classes;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassesMapper {

    @Select("SELECT * FROM class")
    public List<Classes> selectClasses();

}
