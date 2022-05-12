package com.shildt.inheritance;

public class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("The area of the figure is not defined");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("In the area of the quadrilateral");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("In the triangle area");
        return dim1 * dim2 / 2;
    }
}

class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);

        Figure figure;

        figure = r;
        System.out.println("S = " + figure.area());

        figure = t;
        System.out.println("S = " + figure.area());

        figure = f;
        System.out.println("S = " + figure.area());
    }
}
