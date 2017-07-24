package com.wleiy.otmDemo.dao.Impl;

import com.alibaba.fastjson.JSON;
import com.wleiy.otmDemo.entity.Grade;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by wl_wl on 2017/7/24 0024.
 */
public class DaoImplTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void searchGrade() throws Exception {
        DaoImpl dao = new DaoImpl();
        List<Grade> grades = dao.searchGrade();
        String s = JSON.toJSONString(grades);
        System.out.println(s);
    }

}