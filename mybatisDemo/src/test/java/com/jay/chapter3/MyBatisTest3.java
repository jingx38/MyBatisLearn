package com.jay.chapter3;

import com.jay.chapter3.entity.Student;
import com.jay.chapter3.mapper.Student3Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author xiang.wei
 * @create 2019/4/25 15:46
 */
public class MyBatisTest3 {

    @Test
    public void testSelectId() {
        String resource = "chapter3/mybatis-cfg.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = factory.openSession();
            Student3Mapper mapper = session.getMapper(Student3Mapper.class);
            Student student = mapper.selectStudentById(1);
            System.out.println("------->student={}"+student);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void  testSelectName() {
        String resource = "chapter3/mybatis-cfg.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = factory.openSession();
            Student3Mapper mapper = session.getMapper(Student3Mapper.class);
            Student student = mapper.selectStudentByNameAngAge("'张三'; DELETE FROM student;#",12);
            System.out.println("------->student={}"+student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void  testSelectNameSQLzhuru() {
        String resource = "chapter3/mybatis-cfg.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = factory.openSession();
            Student3Mapper mapper = session.getMapper(Student3Mapper.class);
            Student student = mapper.selectStudentByNameZhuru("'张三'; delete from student;#");
            System.out.println("------->student={}"+student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
