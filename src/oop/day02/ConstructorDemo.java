package oop.day02;

import org.w3c.dom.ls.LSOutput;

public class ConstructorDemo {
    public static void main(String[] args) {

    }
    class A{
        public A(){
            System.out.println("A");
        }
    }
    class B extends A{
        public B() {
            System.out.println("B");
        }
    }
    class Moo{
        public Moo(int a){
            System.out.println(a);
        }
        public Moo(){
            System.out.println("Moo()");
        }
    }
    class Noo extends Moo{
        public Noo(){
            super(5);
        }
        public Noo(int x){
            this();
        }
    }
    class Xoo{
        public  Xoo(){
            System.out.println("Xoo()----");
        }
        public Xoo(int x){
            System.out.println("Xoo(int x)---");
        }
    }
    class Yoo extends Xoo{
        public Yoo(){
            super();
            System.out.println("Yoo()");
        }
        public Yoo(int x){
            super(x);
            System.out.println("Yoo(int x):"+x);
        }
    }
    class Foo{
        int a;
        public Foo(){
            System.out.println("Foo()");
        }
        public Foo(int a) {
            this.a = a;
        }
    }
    class Goo extends Foo{

    }


}
