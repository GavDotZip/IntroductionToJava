package A6;

import java.util.ArrayList;

class Tester {

    public static void main(String[] args){

        ArrayList<Shape> shapes = new ArrayList<>();

        Circle bigCircle = new Circle(100);
        Circle mediumCircle = new Circle(10);
        Circle smallCircle = new Circle(1);

        Rectangle bigRectangle = new Rectangle(100, 100);
        Rectangle mediumRectangle = new Rectangle(10, 10);
        Rectangle smallRectangle = new Rectangle(1, 1);

        shapes.add(bigCircle);
        shapes.add(mediumCircle);
        shapes.add(smallCircle);
        shapes.add(bigRectangle);
        shapes.add(mediumRectangle);
        shapes.add(smallRectangle);

        System.out.println(largestShape(shapes));

    }


    public static Shape largestShape(ArrayList<Shape> list){

        double largestArea = 0;
        Shape largestShape = null;

        for (Shape shape : list) {

            double currentArea = shape.getArea();

            if (currentArea > largestArea) {
                largestArea = currentArea;
                largestShape = shape;
            }
        }

        return largestShape;

    }
}

