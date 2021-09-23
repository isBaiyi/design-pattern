package com.baiyi.design.principle.openclose;

/**
 * @author: BaiYi
 * @description: 搜狗输入法
 * @date: 2021/9/23 11:02
 */
public class SougouInput {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }
}
