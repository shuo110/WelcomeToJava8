package com.zsr.java8.feature2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author zhaosr
 * @description 运用Lambda表达式对字符串列表进行排序
 * @date 2019/12/24 4:55
 */
public class LambdaDemo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("勒布朗-詹姆斯", "阿德托昆博", "阿玛雷-斯塔德迈尔", "拉简-隆多");

        //testLambdaCode1(list);
        testLambdaCode2(list);
        //testLambdaCode3(list);
        //testLambdaCode4(list);

        System.out.println(list.get(1));
    }

    private static void testLambdaCode1(List<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    private static void testLambdaCode2(List<String> list) {
        Collections.sort(list, (String a, String b) -> {
            return b.compareTo(a);
        });
    }

    private static void testLambdaCode3(List<String> list) {
        Collections.sort(list, (String a, String b) -> b.compareTo(a));
    }

    private static void testLambdaCode4(List<String> list) {
        Collections.sort(list, (a, b) -> b.compareTo(a));
    }

}
