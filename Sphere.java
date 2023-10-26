public class Sphere extends ThreeDimensionalShape {
    private double radius;

    public Sphere(double radius) {
        super(3, (4.0 / 3.0) * Math.PI * radius * radius * radius);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}