package com.jay.entity;

import com.jay.enums.SexEnum;
import lombok.Data;

@Data
public class Student {

    // 学号
    private Integer id;

    // 姓名
    private String name;

    // 年龄
    private Integer age;

    // 班级
    private ClassRoom classRoom;
    /**
     * 性别
     */
    private SexEnum sexEnum;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classRoom=" + classRoom +
                ", sexEnum=" + sexEnum +
                '}';
    }
}
