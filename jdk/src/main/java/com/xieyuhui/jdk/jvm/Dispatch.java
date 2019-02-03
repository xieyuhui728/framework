package com.xieyuhui.jdk.jvm;

/**
 * @Auther: xieyuhui
 * @Date: 2019-02-02 15:34
 * @Description: 单分派与多分派演示
 * 这里有两套继承体系，一个QQ和360，它们做为参数用来解释静态分派
 * 一个是Father和Son，它们做为类型用来解释动态分派
 */
public class Dispatch {

    static class QQ {
        @Override
        public String toString() {
            return "QQ";
        }
    }

    static class QQSon extends QQ {
        @Override
        public String toString() {
            return "QQSon";
        }
    }

    static class _360 {
        @Override
        public String toString() {
            return "360";
        }
    }

    static class _360Son extends _360 {
        @Override
        public String toString() {
            return "360Son";
        }
    }

    public static class Father {
        public void hardChoice(QQ arg) {
            System.out.println("father choose " + arg.toString());
        }

        public void hardChoice(QQSon arg) {
            System.out.println("father choose " + arg.toString());
        }

        public void hardChoice(_360 arg) {
            System.out.println("father choose " + arg.toString());
        }

        public void hardChoice(_360Son arg) {
            System.out.println("father choose " + arg.toString());
        }
    }

    public static class Son extends Father {
        @Override
        public void hardChoice(QQ arg) {
            System.out.println("son choose " + arg.toString());
        }

        @Override
        public void hardChoice(QQSon arg) {
            System.out.println("son choose " + arg.toString());
        }

        @Override
        public void hardChoice(_360 arg) {
            System.out.println("son choose " + arg.toString());
        }

        @Override
        public void hardChoice(_360Son arg) {
            System.out.println("son choose " + arg.toString());
        }
    }

    public static void main(String[] args) {
        Father father = new Father();
        Father son = new Son();

        QQ qq = new QQ();
        QQ qqSon = new QQSon();

        _360 _360 = new _360();
        _360 _360Son = new _360Son();

        father.hardChoice(qq);
        father.hardChoice(qqSon);

        son.hardChoice(_360);
        son.hardChoice(_360Son);
    }

}
