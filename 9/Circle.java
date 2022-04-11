public class Circle extends SimpleGeometricObject {
    private double radius;

    /** Construct a default circle */
    public Circle() {
    }

    /** Construct a circle with the specified radius */
    public Circle(double radius) {
        this.radius = radius;
        // setColor = "white";
        // setFilled = false;
    }

    // public SimpleGeometricObject getCircle() {
    // return new Circle();
    // }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    /** Return perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /** Return a string representation of this object */
    public String toString() {
        return "created on " + getDateCreated() + "\nradius: " + radius +
                " and area: " + getArea();
    }
}
