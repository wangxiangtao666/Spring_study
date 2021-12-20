package com.tao.mapper;

import com.tao.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAllUser();
    int addUser(User user);
    int delUser(int id);
}
