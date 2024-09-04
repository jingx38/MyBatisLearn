package com.jay;

import org.apache.ibatis.binding.MapperMethod;
import org.apache.ibatis.scripting.xmltags.DynamicContext;
import org.apache.ibatis.scripting.xmltags.MixedSqlNode;
import org.apache.ibatis.scripting.xmltags.StaticTextSqlNode;
import org.apache.ibatis.scripting.xmltags.WhereSqlNode;
import org.apache.ibatis.session.Configuration;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by xiang.wei on 2019/5/13
 *
 * @author xiang.wei
 */
public class SqlNodeTest {
    @Test
    public void testWhereSqlNode() {
        String sqlFragment = "AND id=#{id}";
        MixedSqlNode mixedSqlNode = new MixedSqlNode(Arrays.asList(new StaticTextSqlNode(sqlFragment)));
        WhereSqlNode whereSqlNode = new WhereSqlNode(new Configuration(), mixedSqlNode);
        DynamicContext dynamicContext = new DynamicContext(new Configuration(), new MapperMethod.ParamMap<>());
        whereSqlNode.apply(dynamicContext);
        System.out.println("解析前：" + sqlFragment);
        System.out.println("解析后："+dynamicContext.getSql());
    }
}
