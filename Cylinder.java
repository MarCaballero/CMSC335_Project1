public class Cylinder extends ThreeDimensionalShape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        super(3, Math.PI * radius * radius * height);
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }
    // method to get cylinder volume
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}
