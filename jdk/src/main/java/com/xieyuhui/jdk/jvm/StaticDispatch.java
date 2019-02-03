package com.xieyuhui.jdk.jvm;

/**
 * @Auther: xieyuhui
 * @Date: 2019-02-02 10:25
 * @Description: 重载，jvm静态分派
 */
public class StaticDispatch {

    static abstract class Human {

    }

    static class Man extends Human {

    }

    static class Woman extends Human {

    }

    public void sayHello(Human human) {
        System.out.println("hello,human");
    }

    public void sayHello(Man man) {
        System.out.println("hello,man");
    }

    public void sayHello(Woman man) {
        System.out.println("hello,Woman");
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();
        StaticDispatch staticDispatch = new StaticDispatch();
        staticDispatch.sayHello(man);
        staticDispatch.sayHello(woman);
    }
}
