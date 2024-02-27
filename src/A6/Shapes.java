package A6;

// Interface defining a shape comparator
interface ShapeComparator {
    // Method to compare two shapes
    int compare(ShapeComparator other);
}

// Abstract class representing a generic shape, implementing the ShapeComparator interface
abstract class Shape implements ShapeComparator {
    // Protected attribute representing the area of the shape
    protected double area;

    // Constructor initializing area to 0
    Shape() {
        this.area = 0;
    }

    // Getter method to retrieve the area of the shape
    public double getArea() {
        return this.area;
    }

    // Abstract method to calculate the area of the shape (to be implemented by subclasses)
    abstract public void calculateArea();

    // Method to compare this shape with another shape
    public int compare(ShapeComparator other) {
        // Casting the other shape to the Shape class
        Shape shape = ((Shape) other);
        // Calculating the area of the other shape
        shape.calculateArea();

        // Comparing the areas of the two shapes
        if (this.area > shape.area) {
            return (int) this.area;
        } else if (this.area < shape.area || this.area == shape.area) {
            return (int) shape.area;
        } else {
            return 0;
        }
    }
}

// Class representing a circle, inheriting from the Shape class
class Circle extends Shape {
    // Private attribute representing the radius of the circle
    private double radius;

    // Default constructor
    Circle() {
        super();
    }

    // Parameterized constructor setting the radius of the circle
    Circle(double radius) {
        super();
        this.radius = radius;
    }

    // Getter method to retrieve the radius of the circle
    public double getRadius() {
        return this.radius;
    }

    // Method to calculate the area of the circle
    public void calculateArea() {
        // Calculating area using the formula for the area of a circle
        double pi = Math.PI;
        this.area = pi * (radius * radius);
    }

    // Method overriding the toString() method to provide a string representation of the circle
    @Override
    public String toString() {
        return "Circle Radius: " + this.radius + " Area: " + this.area;
    }

    // Method to compare this circle with another shape
    public int compare(ShapeComparator other) {
        return super.compare(other);
    }
}

// Class representing a rectangle, inheriting from the Shape class
class Rectangle extends Shape {
    // Protected attributes representing the length and width of the rectangle
    protected double length;
    protected double width;

    // Default constructor
    Rectangle() {
        super();
    }

    // Parameterized constructor setting the length and width of the rectangle
    Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    // Setter method to set the width of the rectangle
    public void setWidth(double width) {
        this.width = width;
    }

    // Setter method to set the length of the rectangle
    public void setLength(double length) {
        this.length = length;
    }

    // Getter method to retrieve the length of the rectangle
    public double getLength() {
        return length;
    }

    // Getter method to retrieve the width of the rectangle
    public double getWidth() {
        return width;
    }

    // Method overriding the toString() method to provide a string representation of the rectangle
    @Override
    public String toString() {
        return "Rectangle Width: " + this.width + " Length: " + this.length;
    }

    // Method to calculate the area of the rectangle
    public void calculateArea() {
        this.area = length * width;
    }

    // Method to compare this rectangle with another shape
    public int compare(ShapeComparator other) {
        return super.compare(other);
    }
}
