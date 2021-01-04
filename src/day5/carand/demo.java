package day5.carand;

public class demo {
    public static void main(String[] args) {
        Car car=new Car();
        car.run();
        car.stop();

        QQ qq=new QQ();
        System.out.println( qq.getType());
        System.out.println(qq.getYears());

        System.out.println(qq.type);
        System.out.println(qq.years);

        qq.run();
        qq.stop();

        System.out.println("-----------2--------");
        car=qq;
        car.run();
        car.stop();
        System.out.println(car);

        System.out.println("------------3--------");
        Car car2=new Car();
        //qq= (QQ) car2;
        //qq.run();

        System.out.println(car2);
        if (car2 instanceof QQ){
            qq=(QQ)car2;
            System.out.println("car2 is QQ,ok!");
        }

        Car car3 = new QQ();
        car3.run();
        qq =(QQ) car3;
        qq.run();;
        qq.stop();
        System.out.println(car3);
        if (car3 instanceof  QQ){
            qq=(QQ) car3;
            System.out.println("car3 is qq.ok!");
        }

    }
}
