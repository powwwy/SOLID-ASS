package With_Princple;

// Interface for calculating area
interface AreaCalculable {
    double calculateArea();
}

interface PerimeterCalculable {
    double calculatePerimeter();
}

class Triangle implements AreaCalculable, PerimeterCalculable {
    private double a, b, c; // three sides of the triangle

    public Triangle(double a, double b, double c) {
        // for triangle inequality
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Invalid triangle sides");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
}

public class TriangleCalculator {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}
