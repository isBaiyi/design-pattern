package com.baiyi.design.principle.singleresponsibility;

/**
 * @author: BaiYi
 * @description: 单例模式
 * @date: 2021/9/17 20:52
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle = new Vehicle2();
        vehicle.run("摩托车");
        vehicle.AirRun("飞机");
        vehicle.WaterRun("轮船");
    }
}

/**
 * 方案三
 * 这里修改的代码相对少, 只是在类中添加相关方法
 * 这里虽然没有在类的级别做到单一职责, 但是在方法上仍然做到了单一职责
 */
class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑....");
    }

    public void WaterRun(String vehicle) {
        System.out.println(vehicle + "在水上跑....");
    }

    public void AirRun(String vehicle) {
        System.out.println(vehicle + "在天上飞....");
    }
}