package com.baiyi.design.pattern.creatation.factorymethod;

/**
 * @author: BaiYi
 * @description:
 * @date: 2021/9/26 22:01
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制 Python 课程");
    }
}
