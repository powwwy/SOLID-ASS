package With_Princple;

// Interface for calculating area
interface AreaCalculable {
    double calculateArea();
}

// Interface for calculating perimeter
interface PerimeterCalculable {
    double calculatePerimeter();
}

// Triangle class implementing only the needed interfaces
class Triangle implements AreaCalculable, PerimeterCalculable {
    private double a, b, c; // Sides of the triangle

    public Triangle(double a, double b, double c) {
        // Optional: Add validation for triangle inequality
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Invalid triangle sides");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        // Heron's formula
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
}

// Main class to test the implementation
public class TriangleCalculator {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}
