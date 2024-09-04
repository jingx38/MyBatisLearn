package com.jay.mapper;

import com.jay.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by xiang.wei on 2019/4/20
 *
 * @author xiang.wei
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class StudentMapperTest {
    @Autowired
    private StudentMapper studentMapper;
    @Test
    public void selectStudentById() throws Exception {
        Student student = studentMapper.selectStudentById(1);
        System.out.println("---->查询结果为={}"+student);
    }

}