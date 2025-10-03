public class Circle {
    private double radius;

    public Circle(double newradius) {
        radius = newradius;
    }

    public void printArea() {
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}