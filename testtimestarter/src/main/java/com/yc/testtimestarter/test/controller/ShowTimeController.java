package com.yc.testtimestarter.test.controller;

import com.helloautoconfiguration.demo.MyTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: testtimestarter
 * @description:
 * @author: 作者
 * @create: 2023-08-11 11:45
 */
@RestController    //@Controller  @ResponseBody
public class ShowTimeController {

    @Autowired
    private MyTime myTime;

    @GetMapping("/showTime")
    public String showTime(@RequestParam String name){
        return myTime.showTime(name);
    }


}
