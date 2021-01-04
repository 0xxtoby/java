package oop.day02.intf;

public class QQ implements car,Product {


    public void stop() {
        System.out.println("dian dian pao");
    }


    public void run() {
        System.out.println("ken ken ting");
    }


    public String getType() {
        return TYPE_A;
    }
}
