package com.baiyi.design.pattern.creatation.singleton.lazy;

/**
 * @author: BaiYi
 * @description: 懒汉式（线程不安全）
 * @date: 2021/10/28 23:41
 */
public class LazySingleton1 {
    private LazySingleton1() {
    }

    private static LazySingleton1 instance;

    public static LazySingleton1 getInstance() {
        // 如果为多线程访问时，存在可能创建多个单例对象
        if (instance == null) {
            instance = new LazySingleton1();
        }
        return instance;
    }
}
