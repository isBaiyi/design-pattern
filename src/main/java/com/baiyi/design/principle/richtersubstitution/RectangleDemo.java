package com.baiyi.design.principle.richtersubstitution;

/**
 * @author: BaiYi
 * @description: 实现 resize 方法进行宽度持续增长的效果
 * @date: 2021/9/23 14:35
 */
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);
        printLengthAndWidth(rectangle);
        System.out.println("==========================");
        Rectangle rectangle1 = new Square();
        rectangle1.setWidth(10);
        resize(rectangle1);
        printLengthAndWidth(rectangle1);
        /*
          细心的小伙伴这时候已经发现了，resize方法中，Rectangle类型的参数是不能被Square类型的参数所代替，
          如果进行了替换就得不到预期结果。因此，Square类和Rectangle类之间的继承关系违反了里氏代换原则，
          它们之间的继承关系不成立，正方形不是长方形。所以我们需要重新设计相关代码，使之符合里氏替换原则。
         */
    }

    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() < rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    public static void printLengthAndWidth(Rectangle rectangle) {
        System.out.println("length is " + rectangle.getLength());
        System.out.println("width is " + rectangle.getWidth());
    }
}
