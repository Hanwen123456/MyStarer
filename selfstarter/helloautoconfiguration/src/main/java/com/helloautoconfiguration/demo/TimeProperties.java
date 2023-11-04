package com.helloautoconfiguration.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program: selfstarter
 * @description:
 * @author: 作者
 * @create: 2023-08-11 10:49
 */
//属性类
//@Component
@ConfigurationProperties("my.time")
public class TimeProperties {
    private String format = "yyyy-MM-dd HH:mm:ss";

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
