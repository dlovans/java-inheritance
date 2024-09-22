package E2;

/**
 * Serves as a base abstract class for all shape types.
 */
public abstract class Shape {
    /**
     * Width of shape.
     */
   final private double width;
    /**
     * Height of shape.
     */
    final private double height;

    /**
     * Initializes an instance of Shape.
     * @param width - Width of shape.
     * @param height - Height of shape.
     */
    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Returns width of shape.
     * @return - Width of shape.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Return height of shape.
     * @return - Height of shape.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Calculates area of a shape.
     * @return - Area of a shape.
     */
    public double getArea() {
        return width * height;
    }
}
