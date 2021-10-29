package com.baiyi.design.pattern.creatation.singleton.lazy;

/**
 * @author: BaiYi
 * @description: 懒汉式（线程安全，加 synchronize 关键字锁方法，锁粒度大）
 * @date: 2021/10/28 23:47
 */
public class LazySingleton2 {
    private LazySingleton2() {
    }

    private static LazySingleton2 instance;

    public static synchronized LazySingleton2 getInstance() {
        if (instance == null) {
            instance = new LazySingleton2();
        }
        return instance;
    }
}
