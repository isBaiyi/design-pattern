package com.baiyi.design.principle.singleresponsibility;

/**
 * @author: BaiYi
 * @description: 单例模式
 * @date: 2021/9/17 20:52
 */
public class SingleResponsibility {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.AirRun("飞机");
        vehicle.WaterRun("轮船");
    }
}

/**
 * 这里虽然没有在类的级别做到单一职责, 但是在方法上仍然做到了单一职责
 */
class Vehicle {
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