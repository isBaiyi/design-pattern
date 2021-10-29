package com.baiyi.design.pattern.creatation.singleton.question;

import com.baiyi.design.pattern.creatation.singleton.innerclass.InnerClassSingleton;
import com.baiyi.design.pattern.creatation.singleton.lazy.LazySingleton1;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author: BaiYi
 * @description:
 * @date: 2021/10/29 10:24
 */
public class Client {
    public static void main(String[] args) {
        // writeObject();
        readObject();
        System.out.println("===========");
        readObject();

        System.out.println("反射破解单例模式示例");
        // 演示反射破坏单例模式
        try {
            Class clazz = Class.forName("com.baiyi.design.pattern.creatation.singleton.innerclass.InnerClassSingleton");
            // 因为构造器私有，所以需要这样获取构造器
            Constructor constructor = clazz.getDeclaredConstructor();
            // 去除访问权限检查（暴力反射）
            constructor.setAccessible(true);
            // 创建对象
            InnerClassSingleton instance1 = (InnerClassSingleton) constructor.newInstance();
            InnerClassSingleton instance2 = (InnerClassSingleton) constructor.newInstance();
            // 如果为 true 则反射没有破坏单例模式，如果为 false 则破坏了单例模式
            System.out.println(instance1 == instance2);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void readObject() {
        ObjectInputStream inputStream = null;
        try {
            inputStream = new ObjectInputStream(new FileInputStream("/Users/baiyi/IdeaProjects" +
                    "/designpattern/src/main/resources/a.txt"));
            SerializableSingleton instance = (SerializableSingleton) inputStream.readObject();
            System.out.println("instance = " + instance);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                assert inputStream != null;
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void writeObject() {
        // 获取 singleton 对象
        SerializableSingleton instance = SerializableSingleton.getInstance();
        ObjectOutputStream outputStream = null;
        try {
            // 获取输出流
            outputStream = new ObjectOutputStream(new FileOutputStream(
                    "/Users/baiyi/IdeaProjects/designpattern/src/main/resources/a.txt"));
            // 写对象
            outputStream.writeObject(instance);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // 关闭流
                assert outputStream != null;
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
