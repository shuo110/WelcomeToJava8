package com.zsr.java8.feature3;

import com.zsr.java8.feature4.PrintName;

/**
 * @author zhaosr
 * @description lambda表达式如何适合Java类型系统？每个lambda对应于由接口指定的给定类型。
 * 所谓的功能接口必须只包含一个抽象方法声明。该类型的每个lambda表达式都将与此抽象方法匹配。
 * 由于默认方法不是抽象的，因此您可以随意将默认方法添加到功能接口中
 * @date 2019/12/25 4:05
 */
public class PrintNameDemo {

    public static void main(String[] args) {
//        printName();
//        printInteger();
//        printInteger1();
//        NBAplayer();
        factoryDemo();
    }

    /**
     * 我们可以将任意接口用作lambda表达式，只要该接口仅包含一种抽象方法即可。
     * 为了确保您的界面符合要求，您应该添加@FunctionalInterface注释。
     * 尝试将第二个抽象方法声明添加到接口时，编译器会意识到此注释，并引发编译器错误
     */
    private static void printName() {
        PrintName<String, String> printName = (name -> new StringBuilder().append("输出").append(name).toString());

        String screenContent = printName.printName("LBJ");

        System.out.println(screenContent);
    }


    private static void printInteger() {
        PrintInteger<String, Integer> printName = (numStr -> Integer.valueOf(numStr));

        Integer number = printName.printInteger("123");

        System.out.println(number);
    }

    /**
     * 通过使用静态方法引用，可以进一步简化上述示例代码
     */
    private static void printInteger1() {
        PrintInteger<String, Integer> printName = Integer::valueOf;

        Integer number = printName.printInteger("345");

        System.out.println(number);
    }

    /**
     * Java 8使您可以通过::关键字传递方法或构造函数的引用。上面的示例显示了如何引用静态方法。
     * 但是我们也可以引用对象方法
     */
    private static void NBAplayer() {
        NBAplayer nbAplayer = new NBAplayer();
        PrintName printName = nbAplayer::getPlayerData;
        String name = printName.printName("lebron james").toString();

        System.out.println(name);
    }

    /**
     * 需手动实现工厂，而是通过构造函数引用将所有内容粘合在一起
     */
    private static void factoryDemo() {
        PersonFactory factory = Person::new;
        Person person = factory.create("lebron james", 35, "LDB32323223");

        System.out.println(person.toString());
    }
}
