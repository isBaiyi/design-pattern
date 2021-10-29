package com.baiyi.design.pattern.creatation.singleton.enums;

/**
 * @author: BaiYi
 * @description:
 * @date: 2021/10/29 00:04
 */
public class Test {
    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        System.out.println(singleton1 == singleton);
    }
}
