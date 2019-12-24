package com.zsr.java8.feature4;

/**
 * @author zhaosr
 * @description 功能界面
 * @date 2019/12/25 4:04
 */
@FunctionalInterface
public interface PrintName<F,T> {
    T  printName(String name);
}
