public class Square extends TwoDimensionalShape {
    private double sideLength;

    public Square(double sideLength) {
        super(2, sideLength * sideLength);
        this.sideLength = sideLength;
    }

    public double getArea() {
        return sideLength * sideLength;
    }
}