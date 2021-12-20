package com.tao.demo;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理角色，还没有获取
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(host);
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();

    }
}
