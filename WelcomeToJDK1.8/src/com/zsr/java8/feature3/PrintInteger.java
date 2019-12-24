package com.zsr.java8.feature3;

/**
 * @author zhaosr
 * @description PrintInteger
 * @date 2019/12/25 4:10
 * @Param numberStr 数字 字符串
 */
@FunctionalInterface
public interface PrintInteger<F,T> {
    T printInteger(String numberStr);
}
