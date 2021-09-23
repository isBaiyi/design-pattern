package com.baiyi.design.principle.richtersubstitution.improve;

/**
 * @author: BaiYi
 * @description: 正方形类
 * @date: 2021/9/23 15:05
 */
public class Square implements Quadrilateral{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        return this.side;
    }

    @Override
    public double getWidth() {
        return this.side;
    }
}
