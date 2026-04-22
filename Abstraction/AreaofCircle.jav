abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double radius = 5;

    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

public class AbstractionDemo1 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();
    }
}
