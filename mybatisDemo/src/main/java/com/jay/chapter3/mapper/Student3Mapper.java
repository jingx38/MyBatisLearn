package com.jay.chapter3.mapper;

import com.jay.chapter3.entity.Student;
import org.apache.ibatis.annotations.Param;

/**
 * Created by xiang.wei on 2019/4/16
 *
 * @author xiang.wei
 */
public interface Student3Mapper {

    /**
     * @param id
     * @return
     */
    Student selectStudentById(@Param("id") Integer id);

    Student selectStudentByNameAngAge(@Param("name") String name,
                                      @Param("age") Integer age);

    Student selectStudentByNameZhuru(@Param("name") String name);
}
