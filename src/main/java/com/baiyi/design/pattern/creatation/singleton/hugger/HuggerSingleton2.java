package com.baiyi.design.pattern.creatation.singleton.hugger;

/**
 * @author: BaiYi
 * @description: 饿汉式（静态代码块）
 * @date: 2021/10/28 23:39
 */
public class HuggerSingleton2 {
    private HuggerSingleton2() {
    }

    private static HuggerSingleton2 instance;

    static {
        instance = new HuggerSingleton2();
    }

    public static HuggerSingleton2 getInstance() {
        return instance;
    }
}
