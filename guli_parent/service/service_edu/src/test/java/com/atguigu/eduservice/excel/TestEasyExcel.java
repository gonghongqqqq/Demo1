package com.atguigu.eduservice.excel;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.List;

public class TestEasyExcel {
    public static void main(String[] args) {
        //excel 写
        //String fileName = "F:\\11.xlsx";
        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        // 如果这里想使用03 则 传入excelType参数即可
        //EasyExcel.write(fileName, DemoData.class).sheet("写入方法一").doWrite(getData());


        //excel读
        String fileName = "F:\\11.xlsx";
        EasyExcel.read(fileName,DemoData.class,new ExcelListener()).sheet().doRead();

    }
    private static List<DemoData> getData(){
        List<DemoData> list = new ArrayList<>();
        for (int i = 0;i<10;i++){
            DemoData demoData = new DemoData();
            demoData.setSname("test"+i);
            demoData.setSno(i);
            list.add(demoData);
        }
        return list;
    }
}
