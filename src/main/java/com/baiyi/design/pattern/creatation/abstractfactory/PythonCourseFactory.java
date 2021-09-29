package com.baiyi.design.pattern.creatation.abstractfactory;

/**
 * @author: BaiYi
 * @description:
 * @date: 2021/9/29 16:50
 */
public class PythonCourseFactory extends CourseFactory{
    @Override
    public Video produceVideo() {
        return new PythonVideo();
    }

    @Override
    public Article produceArticle() {
        return new PythonArticle();
    }
}
