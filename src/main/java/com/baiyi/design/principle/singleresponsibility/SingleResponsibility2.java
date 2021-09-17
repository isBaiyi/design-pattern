package com.baiyi.design.principle.singleresponsibility;

/**
 * @author: BaiYi
 * @description:
 * @date: 2021/9/17 21:38
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RunVehicle runVehicle = new RunVehicle();
        runVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WatarVehicle watarVehicle = new WatarVehicle();
        watarVehicle.run("轮船");
    }
}

/**
 * 方式二:
 * 1. 遵守了单一职责原则
 * 2. 但是改动的相当大, 即将类进行分解, 同时修改客户端
 * 改进: 直接修改 Vehicle 类, 修改的代码相对较少 --> 方案三
 */

class RunVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑....");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天上飞....");
    }
}

class WatarVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在水上跑....");
    }
}