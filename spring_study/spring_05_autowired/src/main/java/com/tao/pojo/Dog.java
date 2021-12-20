package com.tao.pojo;

public class Dog {
    private  String dogName;
    public void shout(){
        System.out.println("wang~"+dogName);
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }
}
