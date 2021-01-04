package sy3.no5;

public class Rectangle extends Shape {
    int length,height;

    @Override
    double area() {
        return length*height;
    }
    Rectangle(int a,int b){
        length=a;
        height=b;
    }
    Rectangle(){};

}
