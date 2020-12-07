package com.snow.dao;

import com.snow.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author Snow
 * @create 2020-12-03 16:54
 */
public interface BlogMapper {

    /**
     * 向数据库中添加信息
     *
     * @param blog
     * @return
     */
    int addBook(Blog blog);

    List<Blog> queryBlogWhere(Map map);

    List<Blog> queryBlogChoose(Map map);

    int updateBlog(Map map);

}
