package sy3.no5;


public class Circle extends Shape {
    int r;

    Circle(int a){
        r=a;
    }

    @Override
    double area() {
        return r*r*3.14;
    }
}
