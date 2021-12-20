package com.tao.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//@Component
public class User {
    @Value("tao")//注入属性
    private String name;
    public String getName() {
        return name;
    }

    //@Value("tao")//放在这也可以，放到上面不写set方法也可以
    public void setName(String name) {
        this.name = name;
    }

    public User() {
        System.out.println("创建了一个User对象");
    }
}