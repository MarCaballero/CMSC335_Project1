public class ThreeDimensionalShape extends Shape {
    private double volume;

    public ThreeDimensionalShape(int numberOfDimensions, double volume) {
        super(numberOfDimensions);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}
