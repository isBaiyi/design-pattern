package com.baiyi.design.pattern.creatation.singleton.lazy;

/**
 * @author: BaiYi
 * @description: 懒汉式（双重检查锁，推荐使用）
 * @date: 2021/10/28 23:50
 */
public class LazySingleton3 {
    private LazySingleton3() {
    }

    private static volatile LazySingleton3 instance;

    public static LazySingleton3 getInstance() {
        if (instance == null) {
            synchronized (LazySingleton3.class) {
                if (instance == null) {
                    instance = new LazySingleton3();
                }
            }
        }
        return instance;
    }
}
