package oop.day02.intf;


public class Demo {
    public static void main(String[] args) {
        QQ qq=new QQ();
        qq.run();
        qq.stop();

        car car=qq;
        car.run();
        car.stop();

    }
}
