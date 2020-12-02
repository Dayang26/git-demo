package com.snow.dao;

import com.snow.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Snow
 * @create 2020-12-02 15:10
 */
public interface TeacherMapper {

    List<Teacher> getTeacher();


}
