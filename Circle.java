public class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        super(2, Math.PI * radius * radius);
        this.radius = radius;
    }

    // method to get circle area
    public double getArea() {
        return Math.PI * radius * radius;
    }
}