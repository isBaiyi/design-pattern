package com.baiyi.design.principle.openclose;

/**
 * @author: BaiYi
 * @description: 测试客户端
 * @date: 2021/9/23 11:07
 */
public class Client {
    public static void main(String[] args) {
        SougouInput input = new SougouInput();
        input.setSkin(new DefaultSkin());
        input.display();

        input.setSkin(new BaiyiSkin());
        input.display();
    }
}
