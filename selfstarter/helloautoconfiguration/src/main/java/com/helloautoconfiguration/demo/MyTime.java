package com.helloautoconfiguration.demo;

import org.springframework.beans.factory.annotation.Autowired;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: selfstarter
 * @description:
 * @author: 作者
 * @create: 2023-08-11 10:48
 */
//功能类   :给name按指定格式显示当前的时间
public class MyTime {

    @Autowired
    private TimeProperties timeProperties;

    public String showTime(String name){
         String format = timeProperties.getFormat();
        DateFormat df = new SimpleDateFormat(format);
        String t = df.format(new Date());
        return "欢迎"+name+",现在是"+t;

    }
}
