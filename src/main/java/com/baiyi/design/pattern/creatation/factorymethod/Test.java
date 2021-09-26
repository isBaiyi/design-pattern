package com.baiyi.design.pattern.creatation.factorymethod;

/**
 * @author: BaiYi
 * @description:
 * @date: 2021/9/26 22:02
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
