import java.util.Date;
import java.util.Scanner;
public class Triangle extends GeometricShape {
    private double side1 = 3.0;
    private double side2 = 4.0;
    private double side3 = 5.0;
    //no arg constructor
    public Triangle() {
    }
    //three arg constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    // Getters and setters for all 3 sides
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    //get the Perimeter
    public double getPerimeter() {
        return (side1 + side2 + side3);
    }
    // Get the Area
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    //print out the triangle with all 3 sides
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
    }
    //main method
    public static void main(String[] args) {
        //scanner
        Scanner scanner = new Scanner(System.in);
        //input from user
        System.out.println("Enter the three sides of the triangle:");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        System.out.println("Enter the color of the triangle:");
        String color = scanner.next();

        System.out.println("Is the triangle filled? (true/false)");
        boolean filled = scanner.nextBoolean();
        //create object
        Triangle triangle = new Triangle(side1, side2, side3);
        GeometricShape shape = new GeometricShape();
        //set the color using setter
        shape.setColour(color);
        shape.setFilled(filled);

        //display the result
        System.out.println("The area of the triangle is " + triangle.getArea());
        System.out.println("The perimeter of the triangle is " + triangle.getPerimeter());
        System.out.println("The color of the triangle is " + shape.getColour());
        System.out.println("Is the triangle filled? " + shape.isFilled());
        System.out.println(triangle.toString());
        System.out.println(shape.toString());
    }
}
