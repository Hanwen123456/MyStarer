package com.helloautoconfiguration;

import com.helloautoconfiguration.demo.TimeProperties;
import com.helloautoconfiguration.demo.MyTime;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: selfstarter
 * @description:
 * @author: 作者
 * @create: 2023-08-11 10:56
 */
@Configuration  //托管配置类
@ConditionalOnClass(MyTime.class)  //条件
@EnableConfigurationProperties(TimeProperties.class)  //属性类的bean
public class MyTimeAutoConfiguration {

    @Bean
    public MyTime myTime(){
        MyTime mt = new MyTime();
        return mt;
    }
}
