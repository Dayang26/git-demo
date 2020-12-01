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
     * 返回User表中全部参数
     *
     * @return
     */
    List<User> getUserList();

    /**
     * 使用map
     *
     * @param map
     * @return
     */
    int add2(Map<String, Object> map);

    /**
     * 通过id查找 使用map
     *
     * @param map
     * @return
     */
    User getUserById(Map<String, Object> map);

    /**
     * 模糊查询
     * @param value
     * @return
     */
    List<User> getUserLike(String value);

}
