package com.mike.pr.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.mike.pr.model.Classes;
import com.mike.pr.service.impl.ClassesService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private ClassesService classesService;

    @GetMapping("getUser")
    public String getCl() {
        List<Classes> list = null;

        list = classesService.selectClasses();
        System.out.println(list.toString());

        //Object jsonResult = JSON.toJSON(list);
        if (StringUtils.isBlank(list.toString())) {
            return "结果为空";
        } else {
            return "success";
        }
    }
}
