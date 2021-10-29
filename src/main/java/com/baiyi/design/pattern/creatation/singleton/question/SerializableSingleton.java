package com.baiyi.design.pattern.creatation.singleton.question;

import java.io.*;

/**
 * @author: BaiYi
 * @description: 序列化破坏单例模式 多次创建的对象都不是同一个
 * @date: 2021/10/29 10:10
 */
public class SerializableSingleton implements Serializable {
    private static final long serialVersionUID = 1L;

    private SerializableSingleton() {
    }

    private static volatile SerializableSingleton instance;

    public static SerializableSingleton getInstance() {
        if (instance == null) {
            synchronized (SerializableSingleton.class) {
                if (instance == null) {
                    instance = new SerializableSingleton();
                }
            }
        }
        return instance;
    }

    public Object readResolve() {
        return getInstance();
    }

}
