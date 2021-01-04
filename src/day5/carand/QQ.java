package day5.carand;

public class QQ  extends Car{
    public  String getType(){
        return type;
    }
    public  int getYears(){
        return years;
    }

    @Override
    public void run() {
        System.out.println("dian dian d pao");
    }
}
