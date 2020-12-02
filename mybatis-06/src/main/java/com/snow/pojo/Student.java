package com.snow.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Snow
 * @create 2020-12-02 15:03
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    private Integer id;
    private String name;
    private Teacher teacher;
}
