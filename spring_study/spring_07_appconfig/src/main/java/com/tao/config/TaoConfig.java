package com.tao.config;

import com.tao.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

// @Configuration它本身就是一个@Component
//@Configuration代表这是一个配置类，相当于xml文件
@Configuration
@ComponentScan("com.tao.pojo")//扫描包
//@Import(TaoConfig2.class)//通过@Import引入其他配置文件
public class TaoConfig {
    //@bean,相当于写bean标签
    //方法的名字，相当于id属性
    //方法的返回值类型，相当于class属性
    @Bean//配置这个就不需要将user设置为一个组件了，相当于注解和配置只使用一个
    public User getUser(){
        return new User();//返回要注入到bean的对象
    }
}
