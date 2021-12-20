package com.tao.mapper;

import com.tao.mapper.UserMapper;
import com.tao.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {
    //SqlSessionTemplate和SqlSession有同样的功能，这里使用SqlSessionTemplate，因为配置只能使用的这个类
    private SqlSessionTemplate sqlSession;
    public void setSqlSession(SqlSessionTemplate sqlSession){
        this.sqlSession = sqlSession;
    }
    public List<User> selectAllUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectAllUser();

    }
}
