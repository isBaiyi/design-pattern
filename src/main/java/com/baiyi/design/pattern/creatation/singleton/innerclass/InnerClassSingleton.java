package com.baiyi.design.pattern.creatation.singleton.innerclass;

/**
 * @author: BaiYi
 * @description: 内部类实现单例模式，这是最完美的单例模式，也是开源项目中最常用的一种
 * @date: 2021/10/28 23:58
 */
public class InnerClassSingleton {
    private InnerClassSingleton() {
    }

    private static class SingletonHandler {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return SingletonHandler.INSTANCE;
    }
}
