package com.baiyi.design.pattern.creatation.abstractfactory;

/**
 * @author: BaiYi
 * @description: 课程工厂
 * @date: 2021/9/29 16:47
 */
public abstract class CourseFactory {
    public abstract Video produceVideo();

    public abstract Article produceArticle();
}
