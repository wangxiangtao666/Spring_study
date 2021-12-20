package com.tao.pojo;

public class Cat {
    private String catName;
    public void shout(){
        System.out.println("miao~"+catName);
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}
