package com.tao.demo;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//暂时先用这个类，自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Rent rent;
    public void setRent(Rent rent){
        this.rent = rent;
    }

    //处理代理实例，并返回键结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());//额外添加的功能
        Object result = method.invoke(rent,args);
        return result;
    }
    public void log(String s){
        System.out.println("执行了"+s+"方法");
    }

    //生成得到代理类//这个可以放在别的类中调用，给好参数就可以，上面就相当于配置一个代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }
}
