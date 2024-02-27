package A6;

import java.util.ArrayList;

// Class for testing shape functionalities
class Tester {

    public static void main(String[] args){

        // Creating an ArrayList to hold shapes
        ArrayList<Shape> shapes = new ArrayList<>();

        // Creating circles of different sizes
        Circle bigCircle = new Circle(100);
        Circle mediumCircle = new Circle(10);
        Circle smallCircle = new Circle(1);

        // Creating rectangles of different sizes
        Rectangle bigRectangle = new Rectangle(100, 100);
        Rectangle mediumRectangle = new Rectangle(10, 10);
        Rectangle smallRectangle = new Rectangle(1, 1);

        // Adding shapes to the ArrayList
        shapes.add(bigCircle);
        shapes.add(mediumCircle);
        shapes.add(smallCircle);
        shapes.add(bigRectangle);
        shapes.add(mediumRectangle);
        shapes.add(smallRectangle);

        // Printing the largest shape based on area
        System.out.println(largestShape(shapes));

    }

    // Method to find the largest shape in the list based on area
    public static Shape largestShape(ArrayList<Shape> list){

        // Initializing variables to hold the largest area and corresponding shape
        double largestArea = 0;
        Shape largestShape = null;

        // Iterating through the list of shapes
        for (Shape shape : list) {

            // Getting the area of the current shape
            double currentArea = shape.getArea();

            // Comparing the area of the current shape with the largest area found so far
            if (currentArea > largestArea) {
                // Updating the largest area and corresponding shape if the current shape has a larger area
                largestArea = currentArea;
                largestShape = shape;
            }
        }

        // Returning the largest shape found
        return largestShape;
    }
}
