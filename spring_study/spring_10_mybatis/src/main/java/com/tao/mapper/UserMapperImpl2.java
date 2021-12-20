package com.tao.mapper;

import com.tao.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    public List<User> selectAllUser() {
        //继承SqlSessionDaoSupport直接获取sqlSession，不用配置SqlSessionTemplate
        //但是还是要配置sqlSessionFactory，父类需要注入sqlSessionFactory对象。
        return getSqlSession().getMapper(UserMapper.class).selectAllUser();
    }
}
