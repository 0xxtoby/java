package sy3.no5;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        System.out.println("请输入序号：");
        System.out.println("1：圆");
        System.out.println("2：长方形");

        Scanner console = new Scanner(System.in);
        int t=console.nextInt();
        if (t==1){
            System.out.println("请输入圆的R：");
            int r=console.nextInt();
            Shape ss=new Circle(r);
            System.out.println("圆的面积是："+ss.area());

        }
        else if (t==2){
            System.out.println("请输入长方形的h：");
            int h=console.nextInt();
            System.out.println("请输入长方形的w：");
            int w=console.nextInt();

            Shape ss=new Rectangle(h,w);
            System.out.println("长方形的面积是："+ss.area());
        }
    }
}
