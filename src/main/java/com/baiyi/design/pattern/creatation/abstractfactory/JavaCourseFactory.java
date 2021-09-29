package com.baiyi.design.pattern.creatation.abstractfactory;

/**
 * @author: BaiYi
 * @description:
 * @date: 2021/9/29 16:45
 */
public class JavaCourseFactory extends CourseFactory{
    @Override
    public Video produceVideo() {
        return new JavaVideo();
    }

    @Override
    public Article produceArticle() {
        return new JavaArticle();
    }
}

