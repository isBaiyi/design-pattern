package com.baiyi.design.pattern.creatation.simplefactory;

/**
 * @author: BaiYi
 * @description: 应用层 测试类
 * @date: 2021/9/25 14:44
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        if (null == video) {
            return;
        }
        video.produce();
        System.out.println("===========");
        Video video1 = new VideoFactory().getVideo(JavaVideo.class);
        video.produce();
    }
}
