package com.baiyi.design.pattern.creatation.abstractfactory;

/**
 * @author: BaiYi
 * @description:
 * @date: 2021/9/29 16:45
 */
public class PythonArticle extends Article{
    @Override
    public void produce() {
        System.out.println("编写 Python 手记");
    }
}
