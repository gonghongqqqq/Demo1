package com.atguigu.eduservice.entity.subject;

import lombok.Data;

import java.util.ArrayList;

//一级分类
@Data
public class OneSubject {
    private String id;
    private String title;

    //一个一级分类有多个二级分类
    private ArrayList<TwoSubject> children = new ArrayList<>();
}
