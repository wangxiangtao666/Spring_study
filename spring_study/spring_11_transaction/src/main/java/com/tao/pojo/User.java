package com.tao.pojo;

public class User {
    private int t_id;
    private String t_name;
    private int t_age;

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public int getT_age() {
        return t_age;
    }

    public void setT_age(int t_age) {
        this.t_age = t_age;
    }

    public User() {
    }

    public User(int t_id, String t_name, int t_age) {
        this.t_id = t_id;
        this.t_name = t_name;
        this.t_age = t_age;
    }

    @Override
    public String toString() {
        return "User{" +
                "t_id=" + t_id +
                ", t_name='" + t_name + '\'' +
                ", t_age=" + t_age +
                '}';
    }
}
