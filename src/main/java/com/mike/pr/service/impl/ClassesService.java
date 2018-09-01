package com.mike.pr.service.impl;

import com.mike.pr.mapper.ClassesMapper;
import com.mike.pr.model.Classes;
import com.mike.pr.service.IClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ClassesService implements IClassesService{

    @Autowired
    ClassesMapper classesMapper;


    public List<Classes> selectClasses(){
        return classesMapper.selectClasses();
    }

}
