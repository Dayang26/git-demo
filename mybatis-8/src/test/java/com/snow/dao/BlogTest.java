package com.snow.dao;

import com.snow.pojo.Blog;
import com.snow.utils.IdUtils;
import com.snow.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

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
        blog.setAuthor("Snow");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        mapper.addBook(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("Jave so easy");
        blog.setAuthor("Snow");

        blog.setCreateTime(new Date());
        blog.setViews(9999);
        mapper.addBook(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("Springboot so easy");
        blog.setCreateTime(new Date());
        blog.setAuthor("Snow");

        blog.setViews(9999);
        mapper.addBook(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("MicroService so easy");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        blog.setAuthor("Snow");

        mapper.addBook(blog);

        sqlSession.close();
    }

    @Test
    public void queryBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();

        map.put("title", "mybatis so easy");
        map.put("author", "Snow");

        List<Blog> blogs = mapper.queryBlogWhere(map);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();
    }

    @Test
    public void queryBlogChoose() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();


        map.put("title", "mybatis so easy");
        map.put("author", "Snow");
        map.put("views", "9999");
        List<Blog> blogs = mapper.queryBlogChoose(map);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();

    }

    @Test
    public void updateBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();


        map.put("title", "~~~~~~~~~~~~~~");
        map.put("author", "Snow");
        map.put("id", "dcde151c.e792.47a1.b1e1.d607f5d4ee61");
        mapper.updateBlog(map);


        sqlSession.close();

    }
}
