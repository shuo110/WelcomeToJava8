package com.zsr.java8.feature1;

/**
 * @author zhaosr
 * @description ArchitectureDemo
 * @date 2019/12/24 4:34
 */
public class ArchitectureDemo {
    public static void main(String[] args) {
        Architecture architecture = new Architecture() {
            @Override
            public String view(String a) {
                return getModel("模型数据");
            }
        };

        System.out.println(architecture.getModel("call getModel"));
        System.out.println(architecture.view(""));
    }
}
