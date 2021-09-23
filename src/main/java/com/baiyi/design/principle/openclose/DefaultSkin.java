package com.baiyi.design.principle.openclose;

/**
 * @author: BaiYi
 * @description: 默认皮肤类
 * @date: 2021/9/23 11:00
 */
public class DefaultSkin extends AbstractSkin{

    @Override
    void display() {
        System.out.println("默认皮肤");
    }
}
