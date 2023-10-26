public class Cube extends ThreeDimensionalShape {
    private double sideLength;

    public Cube(double sideLength) {
        super(3, sideLength * sideLength * sideLength);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    // method to get cube volume
    public double getVolume() {
        return sideLength * sideLength * sideLength;
    }
}