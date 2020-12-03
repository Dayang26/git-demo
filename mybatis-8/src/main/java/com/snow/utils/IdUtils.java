package com.snow.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @author Snow
 * @create 2020-12-03 16:42
 */
public class IdUtils {
    public static String getId() {
        return UUID.randomUUID().toString().replaceAll("-",".");

    }


    @Test
    public void test(){
        System.out.println(getId());
    }


}
