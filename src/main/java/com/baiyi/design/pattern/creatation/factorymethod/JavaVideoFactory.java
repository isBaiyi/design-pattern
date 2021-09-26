package com.baiyi.design.pattern.creatation.factorymethod;

/**
 * @author: BaiYi
 * @description:
 * @date: 2021/9/26 22:00
 */
public class JavaVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
