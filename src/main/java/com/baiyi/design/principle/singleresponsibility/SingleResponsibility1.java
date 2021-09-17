package com.baiyi.design.principle.singleresponsibility;

/**
 * @author: BaiYi
 * @description:
 * @date: 2021/9/17 21:34
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("轮船");
        vehicle.run("飞机");
    }
}

/**
 * 方案一
 * Vehicle 的 run 方法 违反了单一职责
 * 改进: 将交通工具运行的不同, 拆分为不同的类即可
 */
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑....");
    }

}