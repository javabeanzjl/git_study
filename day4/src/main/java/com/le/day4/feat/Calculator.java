package com.le.day4.feat;

/**
 * @author 程序员阿乐
 * @description
 * @createDate 2025/3/17 08:40
 */
public class Calculator {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    /**
     * 加法
     *
     * @param a
     * @param b
     * @return
     */
    public static Integer add(Integer a, Integer b) {
        // 参数验证
        if (a == null || b == null) {
            return 0;
        }
        return a + b;
    }

    /**
     * 计算 a - b
     * @param a
     * @param b
     * @return
     */
    public static Integer sub(Integer a, Integer b) {
        return a - b;
    }
}
