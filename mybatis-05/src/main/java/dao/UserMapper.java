package dao;



import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import pojo.User;

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

    List<User> getUserByLimit(Map<String, Object> map);

    @Select("select * from mybatis.user")
    List<User> getUserAll();

    @Select("select * from mybatis.user where id=#{id} and name=#{name}")
    User getUserById3(@Param("id") int id,@Param("name") String name);

    @Update("update mybatis.user set name=#{name},pwd=#{password} where id = #{id}")
    int updateUserById(User user);
}
