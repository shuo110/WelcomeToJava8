package com.zsr.java8.feature4;

import com.zsr.java8.feature1.Architecture;

/**
 * @author zhaosr
 * @description EntityAndStaticVariable
 * @date 2019/12/25 5:20
 */
public class EntityAndStaticVariable {

    static String city; //城市
    String  arena;  //球馆

    private void innerMethod(){}

    /**
     * 无法从lambda表达式内访问默认方法。以下代码无法编译
     */
    private void test(){

//        Architecture architecture = (a -> {
//            return architecture.getModel(a);});  无法编译
    }

    /**
     * 与局部变量相反，我们可以从lambda表达式中对实例字段和静态变量进行读写访问。
     * 此行为从匿名对象中是众所周知的
     */
    void testScopes() {
        PrintName<String, String> printName = (from) -> {
            arena = "北岸花园";
            return  arena + "--" + from;
        };
        System.out.println("printName--" + printName.printName("加内特"));

        PrintName<String, String> printName1 = (from) -> {
            city = "波士顿";
            return  city  + "--" + from;
        };
        System.out.println("printName1--" + printName1.printName("皮尔斯"));
    }

    public static void main(String[] args) {
        EntityAndStaticVariable entityAndStaticVariable = new EntityAndStaticVariable();
        entityAndStaticVariable.testScopes();
    }
}
