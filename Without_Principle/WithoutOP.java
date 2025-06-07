class Circle {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
}

class Rectangle {
    double width, height;
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
}

public class WithoutOP {
    public static double totalArea(Object[] shapes) {
        double total = 0;
        for (Object shape : shapes) {
            if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                total += Math.PI * c.radius * c.radius;
            } else if (shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                total += r.width * r.height;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Object[] shapes = {
            new Circle(5),
            new Rectangle(4, 6)
        };
        System.out.println("Total area: " + totalArea(shapes));
    }
}
