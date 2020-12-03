package com.snow.dao;

import com.snow.pojo.Blog;
import com.snow.utils.IdUtils;
import com.snow.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;

/**
 * @author Snow
 * @create 2020-12-03 16:59
 */
public class BlogTest {
    @Test
    public void addBook() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();

        blog.setId(IdUtils.getId());
        blog.setTitle("mybatis so easy");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        mapper.addBook(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("Jave so easy");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        mapper.addBook(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("Springboot so easy");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        mapper.addBook(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("MicroService so easy");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        mapper.addBook(blog);

        sqlSession.close();
    }
}
