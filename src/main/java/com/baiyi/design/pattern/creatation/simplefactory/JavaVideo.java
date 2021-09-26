package com.baiyi.design.pattern.creatation.simplefactory;

/**
 * @author: BaiYi
 * @description: java 课程
 * @date: 2021/9/25 14:43
 */
public class JavaVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制 Java 课程视频!");
    }
}
