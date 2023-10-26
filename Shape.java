public class Shape {
    // attribute that accounts the number of dimensions of the shape
    private int numberOfDimensions;

    // constructor that sets the number of dimensions of the shape
    public Shape(int numOfDimensions) {
        this.numberOfDimensions = numOfDimensions;
    }
    // method that returns the number of dimensions of the shape
    public int getNumberOfDimensions() {
        return numberOfDimensions;
    }
}