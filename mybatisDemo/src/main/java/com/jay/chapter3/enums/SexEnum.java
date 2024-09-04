package com.jay.chapter3.enums;

import com.jay.chapter3.BaseEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiang.wei on 2019/4/16
 *
 * @author xiang.wei
 */
public enum SexEnum implements BaseEnum<SexEnum, String> {
    MAN("0", "男"),
    WEMAN("1", "女"),;
    private String key;
    private String value;


    SexEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }
    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "SexEnum{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
