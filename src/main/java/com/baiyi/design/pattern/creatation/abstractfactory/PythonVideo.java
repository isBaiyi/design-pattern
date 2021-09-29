package com.baiyi.design.pattern.creatation.abstractfactory;

/**
 * @author: BaiYi
 * @description:
 * @date: 2021/9/29 16:43
 */
public class PythonVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制 Python 课程");
    }
}
