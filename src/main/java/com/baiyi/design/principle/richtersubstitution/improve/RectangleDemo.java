package com.baiyi.design.principle.richtersubstitution.improve;

/**
 * @author: BaiYi
 * @description: 测试demo
 * @date: 2021/9/23 15:06
 */
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);
        printLengthAndWidth(rectangle);
        System.out.println("==========================");
        Square square = new Square();
        square.setSide(10);
        printLengthAndWidth(square);
    }

    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    public static void printLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.println("length is " + quadrilateral.getLength());
        System.out.println("width is " + quadrilateral.getWidth());
    }
}
