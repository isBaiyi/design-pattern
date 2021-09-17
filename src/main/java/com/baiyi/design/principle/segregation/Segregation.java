package com.baiyi.design.principle.segregation;

/**
 * @author: BaiYi
 * @description: 未使用接口隔离原则反例
 * 1. 类 A通过 Interface1 依赖使用类 B
 * 2. 但类 A 只会使用Interface1 的 1、2、3 方法
 * 3. 类 C通过 Interface1 依赖使用类 D
 * 4. 但类 C 只会使用Interface1 的 1、4、5 方法
 * @date: 2021/9/17 22:35
 */
public class Segregation {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());
        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());
    }
}

interface Interface1 {
    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

class B implements Interface1 {
    @Override
    public void operation1() {
        System.out.println("类 B 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("类 B 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("类 B 实现了 operation3");
    }

    @Override
    public void operation4() {
        System.out.println("类 B 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("类 B 实现了 operation5");
    }
}

class D implements Interface1 {
    @Override
    public void operation1() {
        System.out.println("类 D 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("类 D 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("类 D 实现了 operation3");
    }

    @Override
    public void operation4() {
        System.out.println("类 D 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("类 D 实现了 operation5");
    }
}

class A {
    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }

    public void depend2(Interface1 interface1) {
        interface1.operation2();
    }

    public void depend3(Interface1 interface1) {
        interface1.operation3();
    }
}

class C {
    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }

    public void depend4(Interface1 interface1) {
        interface1.operation4();
    }

    public void depend5(Interface1 interface1) {
        interface1.operation5();
    }
}