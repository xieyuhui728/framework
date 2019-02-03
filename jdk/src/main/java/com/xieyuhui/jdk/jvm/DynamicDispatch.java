package com.xieyuhui.jdk.jvm;

/**
 * @Auther: xieyuhui
 * @Date: 2019-02-02 10:31
 * @Description: 重写，jvm动态分派
 */
public class DynamicDispatch {

    static abstract class Human {
        protected abstract void sayHello();
    }

    static class Man extends DynamicDispatch.Human {

        @Override
        protected void sayHello() {
            System.out.println("hello,man");
        }
    }

    static class Woman extends DynamicDispatch.Human {

        @Override
        protected void sayHello() {
            System.out.println("hello,woman");
        }
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();
        man.sayHello();
        woman.sayHello();
        man = new Woman();
        man.sayHello();
    }
}
