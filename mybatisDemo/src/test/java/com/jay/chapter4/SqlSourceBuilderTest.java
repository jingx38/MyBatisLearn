package com.jay.chapter4;

import org.apache.ibatis.builder.SqlSourceBuilder;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.session.Configuration;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiang.wei on 2019/5/13
 *
 * @author xiang.wei
 */
public class SqlSourceBuilderTest {

    @Test
    public void test() {
//        带有复杂#{}占位符的参数，接下来会解析这个占位符
        String sql = "SELECT * FROM Author WHERE age=#{age} AND name=#{name}";
        SqlSourceBuilder sqlSourceBuilder = new SqlSourceBuilder(new Configuration());
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("age",12);
        paramMap.put("name", "张三");
        SqlSource sqlSource = sqlSourceBuilder.parse(sql, Author.class, paramMap);

        BoundSql boundSql = sqlSource.getBoundSql(new Author());

        System.out.println(String.format("--->SQL %s\n", boundSql.getSql()));
        System.out.println(String.format("ParameterMappings: %s", boundSql.getParameterMappings()));
    }

    class Author{
        private Integer id;
        private String name;
        private Integer age;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}
