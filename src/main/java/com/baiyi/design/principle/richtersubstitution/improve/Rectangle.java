package com.baiyi.design.principle.richtersubstitution.improve;

/**
 * @author: BaiYi
 * @description: 长方形类
 * @date: 2021/9/23 15:04
 */
public class Rectangle implements Quadrilateral{
    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getLength() {
        return this.length;
    }

    @Override
    public double getWidth() {
        return this.width;
    }
}
