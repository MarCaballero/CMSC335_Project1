public class TwoDimensionalShape extends Shape {
    private double area;

    public TwoDimensionalShape(int numberOfDimensions, double area) {
        super(numberOfDimensions);
        this.area = area;
    }

    public double getArea() {
        return area;
    }
}