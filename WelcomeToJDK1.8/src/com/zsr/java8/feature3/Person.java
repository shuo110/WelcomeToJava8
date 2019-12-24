package com.zsr.java8.feature3;

/**
 * @author zhaosr
 * @description Person
 * @date 2019/12/25 4:30
 */
public class Person {

    String name;

    int age;

    String idCard;

    public Person() {
    }

    public Person(String name, int age, String idCard) {
        this.name = name;
        this.age = age;
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", idCard='" + idCard + '\'' +
                '}';
    }
}
