

import dao.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;
import utils.MybatisUtils;

import java.util.List;

/**
 * @author Snow
 * @create 2020-11-29 12:54
 */
public class UserMapperTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userAll = mapper.getUserAll();
        for (User user : userAll) {
            System.out.println(user);
        }

        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i=1;
        String j ="111";
        User userById3 = mapper.getUserById3(i, j);
        System.out.println(userById3);

        sqlSession.close();
    }

    @Test
    public void updateUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.updateUserById(new User(3, "qqq", "qqq"));

        System.out.println(i);

        sqlSession.close();
    }
}
