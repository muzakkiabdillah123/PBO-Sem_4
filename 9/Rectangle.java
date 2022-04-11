public class Rectangle extends SimpleGeometricObject {
    private double width;
    private double height;

    /** Construct a default rectangle */
    public Rectangle() {
    }

    /** Construct a rectangle with the specified width and height */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /** Return width */
    public double getWidth() {
        return width;
    }

    /** Set a new width */
    public void setWidth(double width) {
        this.width = width;
    }

    /** Return height */
    public double getHeight() {
        return height;
    }

    /** Set a new height */
    public void setHeight(double height) {
        this.height = height;
    }

    /** Return area */
    public double getArea() {
        return width * height;
    }

    /** Return perimeter */
    public double getPerimeter() {
        return 2 * (width + height);
    }

    /** Return a string representation of this object */
    public String toString() {
        return "created on " + getDateCreated() + "\nwidth: " + width +
                " and height: " + height + " and area: " + getArea();
    }
}
