package com.baiyi.design.pattern.creatation.abstractfactory;

/**
 * @author: BaiYi
 * @description:
 * @date: 2021/9/29 16:42
 */
public class JavaVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制 Java 课程");
    }
}
