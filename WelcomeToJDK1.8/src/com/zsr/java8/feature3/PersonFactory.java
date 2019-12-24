package com.zsr.java8.feature3;

/**
 * @author zhaosr
 * @description PersonFactory
 * @date 2019/12/25 4:30
 */
public interface PersonFactory {

    Person create(String name, int age, String idCard);

}
