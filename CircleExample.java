import java.util.Scanner;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class CircleExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Circle myCircle = new Circle(radius);

        System.out.println("Radius of the circle: " + myCircle.getRadius());
        System.out.println("Area of the circle: " + myCircle.calculateArea());
        System.out.println("Circumference of the circle: " + myCircle.calculateCircumference());

        // You can modify the radius if needed
        System.out.print("Enter a new radius for the circle: ");
        double newRadius = scanner.nextDouble();
        myCircle.setRadius(newRadius);

        System.out.println("Updated radius of the circle: " + myCircle.getRadius());
        System.out.println("Updated area of the circle: " + myCircle.calculateArea());
        System.out.println("Updated circumference of the circle: " + myCircle.calculateCircumference());

        scanner.close();
    }
}
