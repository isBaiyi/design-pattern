package com.baiyi.design.pattern.creatation.singleton.hugger;

/**
 * @author: BaiYi
 * @description: 饿汉式（静态方法）
 * @date: 2021/10/28 23:36
 */
public class HuggerSingleton1 {
    // 1. 构造器私有化，不给外部创建对象
    private HuggerSingleton1() {
    }

    // 2. 提供静态成员变量，保证创建的都是同一个
    private static HuggerSingleton1 instance = new HuggerSingleton1();

    // 3. 提供外部获取单例对象
    public static HuggerSingleton1 getInstance() {
        return instance;
    }
}
