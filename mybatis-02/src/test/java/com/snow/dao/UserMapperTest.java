package com.snow.dao;

import com.snow.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author Snow
 * @create 2020-11-26 0:07
 */
public class UserMapperTest {

    @Test
    public void deleteUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUserById(5);
        System.out.println(i);

        sqlSession.commit();
        sqlSession.close();
    }



}
