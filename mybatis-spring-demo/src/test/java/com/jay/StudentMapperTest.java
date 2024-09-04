package com.jay;

import com.jay.entity.Student;
import com.jay.mapper.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by xiang.wei on 2019/4/20
 *
 * @author xiang.wei
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:SpringContext.xml")
public class StudentMapperTest {
    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void testSelectStudentById() {
        Student student = studentMapper.selectStudentById(1);
        System.out.println(student.toString());

    }
}
