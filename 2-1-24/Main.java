import java.util.Scanner;

class inputscanner {
    int a, b;

    void input() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two numbers");
        a = in.nextInt();
        b = in.nextInt();
    }
}

abstract class Shape extends inputscanner {
    abstract void printArea();
}

class Rectangle extends Shape {
    void printArea() {
        System.out.println("THE AREA OF RECTANGLE:" + (a * b));
    }
}

class Triangle extends Shape {
    void printArea() {
        System.out.println("THE AREA OF TRIANGLE:" + ((a * b) / 2));
    }
}

class Circle extends Shape {
    void printArea() {
        System.out.println("THE AREA OF CIRCLE:" + (3.14 * a * a));
    }
}

public class Main {
    public static void main(String args[]) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Circle c = new Circle();
            System.out.println("NITHIN KOUSHIK PV ");
        System.out.println("Enter dimensions for Rectangle:");
        r.input();
        r.printArea();

        System.out.println("Enter dimensions for Triangle:");
        t.input();
        t.printArea();

        System.out.println("Enter dimensions for Circle:");
        c.input();
        c.printArea();
    }
}
