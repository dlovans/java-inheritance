package E2;

/**
 * Represents a Triangle shape, subclassing Shape class.
 */
public class Triangle extends Shape {
    /**
     * Initializes an instance of Triangle.
     * @param width - Width of triangle.
     * @param height - Height of triangle.
     */
    public Triangle(double width, double height) {
        super(width, height);
    }

    /**
     * Calculates area of a triangle.
     * Overrides superclass method.
     * @return - Area of a triangle.
     */
    @Override
    public double getArea() {
        return super.getWidth() * super.getHeight() / 2;
    }
}
