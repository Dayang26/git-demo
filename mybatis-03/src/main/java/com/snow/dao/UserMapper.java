package com.snow.dao;

import com.snow.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author Snow
 * @create 2020-11-25 20:15
 */
public interface UserMapper {

    /**
     * 通过id查找 使用map
     *
     * @param map
     * @return a
     */
    User getUserById(Map<String, Object> map);

    User getUserById2(int id);
}
