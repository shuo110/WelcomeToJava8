package com.zsr.java8.feature1;

import java.util.Random;

/**
 * @author zhaosr
 * @description Java 8使我们能够通过使用default关键字向接口添加非抽象方法实现。此功能也称为扩展方法
 * @date 2019/12/24 4:24
 */
public interface Architecture {
    String view(String a);

    default String getModel(String a) {
        return new StringBuilder("Model-").append(new Random().nextInt())
                .append("-Type").append(" description=>").append(a).toString();
    }
}
