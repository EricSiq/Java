// Abstract class Shape for common shape properties
public abstract class Shape {
    protected String shapeName;

    // Constructor
    public Shape(String shape) {
        this.shapeName = shape;
    }

    // Abstract methods to be implemented by child classes
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

