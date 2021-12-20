package com.tao.service;

import com.tao.dao.UserDao;
import com.tao.dao.UserDaoImpl1;

public class UserServiceImpl implements UserService{
    //用户调用业务层，不接触dao层

    private UserDao userDao ;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }

    //用户调用业务层，不接触dao层
//    private UserDao userDao = new UserDaoImpl1();
//
//    public void getUser() {
//        userDao.getUser();
//    }
}
