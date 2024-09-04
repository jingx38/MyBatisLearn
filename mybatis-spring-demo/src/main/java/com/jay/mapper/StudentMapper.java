package com.jay.mapper;

import com.jay.entity.Student;
import org.springframework.stereotype.Repository;

/**
 * Created by xiang.wei on 2019/4/20
 *
 * @author xiang.wei
 */
@Repository
public interface StudentMapper {

    /**
     * 根据id查询学生
     * @param id
     * @return
     */
    Student selectStudentById(Integer id);

}
