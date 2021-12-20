package com.tao.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//注册为组件
//等价于<bean id="user" class="com.tao.pojo.User" />
@Component
public class User {
    //<property name="name" value="tao"/>
    @Value("tao")//注入属性
    private String name;
    public String getName() {
        return name;
    }

    //@Value("tao")//放在这也可以，放到上面不写set方法也可以
    public void setName(String name) {
        this.name = name;
    }
}
