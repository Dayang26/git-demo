package com.snow.dao;

import com.snow.pojo.User;
import com.snow.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Snow
 * @create 2020-11-25 20:22
 */
public class UserMapperTest {

    @Test
    public void getUserList() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }

    }

    @Test
    public void add2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<String, Object>();

        map.put("userId", 5);
        map.put("userName", 555);
        map.put("userPwd", 555);

        int i = mapper.add2(map);
        System.out.println(i);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("id", 3);
        map.put("name", 333);
        User userById = mapper.getUserById(map);
        System.out.println(userById);
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void getUserLike() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userLike = mapper.getUserLike("%1%");

        for (User user : userLike) {
            System.out.println(user);
        }

        sqlSession.commit();
        sqlSession.close();
    }
}
