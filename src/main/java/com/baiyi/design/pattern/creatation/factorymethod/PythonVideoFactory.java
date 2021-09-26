package com.baiyi.design.pattern.creatation.factorymethod;

/**
 * @author: BaiYi
 * @description:
 * @date: 2021/9/26 22:09
 */
public class PythonVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
