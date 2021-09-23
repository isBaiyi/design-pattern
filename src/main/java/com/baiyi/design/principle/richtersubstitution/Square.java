package com.baiyi.design.principle.richtersubstitution;

/**
 * @author: BaiYi
 * @description: 正方形不是长方形
 * @date: 2021/9/23 14:29
 */
public class Square extends Rectangle{

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setLength(width);
        super.setWidth(width);
    }
}
