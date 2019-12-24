package com.zsr.java8.feature4;

/**
 * @author zhaosr
 * @description LocalVariable
 * @date 2019/12/25 4:57
 */
public class LocalVariable {


    /**
     * 1.我们可以从lambda表达式的外部范围读取最终的局部变量
     *
     * 2.但是与匿名对象不同，该变量teamNo不必声明为final。此代码也有效
     *
     * 3.但是，num必须隐式最终才能编译代码。以下代码无法编译
     * @param args
     */
    public static void main(String[] args) {
//      int teamNo = 11;
        final int teamNo = 123;
        PrintName<String,String> printName = (first)-> new StringBuilder()
                .append(first).append(teamNo).append(" the captain is ").append("lebron james").toString();

        System.out.println(printName.printName(""));
    }
}
