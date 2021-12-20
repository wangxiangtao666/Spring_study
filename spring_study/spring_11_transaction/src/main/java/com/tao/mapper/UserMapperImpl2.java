package com.tao.mapper;

import com.tao.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    public List<User> selectAllUser() {
        addUser(new User(4,"tao",12));
        delUser(4);

        return getSqlSession().getMapper(UserMapper.class).selectAllUser();
    }

    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    public int delUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).delUser(id);
    }
}
