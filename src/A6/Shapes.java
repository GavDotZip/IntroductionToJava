package A6;

interface ShapeComparator {
    int compare(ShapeComparable other);
}

abstract class Shape implements ShapeComparator {
    protected double area;

    Shape() {
        this.area = 0;
    }

    public double getArea() {
        return this.area;
    }

    abstract public void calculateArea();

    public int compare(ShapeComparable other) {
        Shape shape = ((Shape) other);
        shape.calculateArea();

        if (this.area > shape.area) {
            return (int) this.area;
        } else if (this.area < shape.area || this.area == shape.area) {
            return (int) shape.area;
        } else {
            return 0;
        }
    }
}

class Circle extends Shape {
    private double radius;
    private double pi = Math.PI;

    Circle() {
        super();
    }

    Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void calculateArea() {
        this.area = this.pi * (radius * radius);
    }

    @Override
    public String toString() {
        return "Circle Radius: " + this.radius + " Area: " + this.area;
    }

    public int compare(ShapeComparable other) {
        return super.compare(other);
    }
}

class Rectangle extends Shape {
    protected double length;
    protected double width;

    Rectangle() {
        super();
    }

    Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Rectangle Width: " + this.width + " Length: " + this.length;
    }

    public void calculateArea() {
        this.area = length * width;
    }

    public int compare(ShapeComparable other) {
        return super.compare(other);
    }
}