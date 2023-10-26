public class Torus extends ThreeDimensionalShape {
    private double majorRadius;
    private double minorRadius;

    public Torus(double majorRadius, double minorRadius) {
        super(3, 2.0 * Math.PI * Math.PI * majorRadius * minorRadius * minorRadius);
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    public double getMajorRadius() {
        return majorRadius;
    }

    public double getMinorRadius() {
        return minorRadius;
    }
    public double getVolume() {
        return 2.0 * Math.PI * Math.PI * majorRadius * minorRadius * minorRadius;
    }
}