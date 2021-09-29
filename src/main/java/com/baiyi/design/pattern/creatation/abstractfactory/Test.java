package com.baiyi.design.pattern.creatation.abstractfactory;

/**
 * @author: BaiYi
 * @description:
 * @date: 2021/9/29 16:51
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.produceArticle().produce();
        javaCourseFactory.produceVideo().produce();
        CourseFactory pythonCourseFactory = new PythonCourseFactory();
        pythonCourseFactory.produceVideo().produce();
        pythonCourseFactory.produceArticle().produce();
    }
}
