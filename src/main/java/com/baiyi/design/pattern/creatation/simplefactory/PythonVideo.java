package com.baiyi.design.pattern.creatation.simplefactory;

/**
 * @author: BaiYi
 * @description: Python 课程
 * @date: 2021/9/25 14:43
 */
public class PythonVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制 Python 课程!");
    }
}
