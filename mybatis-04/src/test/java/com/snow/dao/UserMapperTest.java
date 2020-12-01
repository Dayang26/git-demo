package com.snow.dao;

import com.snow.pojo.User;
import com.snow.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Snow
 * @create 2020-11-26 0:07
 */
public class UserMapperTest {


    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();

        map.put("id", 3);
        map.put("name", 333);
        User userById = mapper.getUserById(map);
        System.out.println(userById);
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void getUserById2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById2 = mapper.getUserById2(1);

        System.out.println(userById2);

        sqlSession.commit();
        sqlSession.close();

    }

    public void getUserByLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();



        sqlSession.close();
    }


}
