// Abstract class representing a Shape
abstract class Shape {
    // Abstract method to calculate area
    public abstract double calculateArea();
}

// Concrete class Circle extending Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete class Rectangle extending Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing the abstract method
    public double calculateArea() {
        return length * width;
    }
}

// Main class
public class Abstraction {
    public static void main(String[] args) {
        // Creating objects of concrete classes
        Circle circle_1 = new Circle(5.0);
        Rectangle rectangle_1 = new Rectangle(4.0, 6.0);

        // Using abstraction to calculate area
        System.out.println("Area of Circle: " + circle_1.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle_1.calculateArea());
    }
}
