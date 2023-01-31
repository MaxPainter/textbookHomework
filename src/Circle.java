/**
 * @class: Circle
 * @author: Max Painter
 * @written: January 31, 2023
 * description: Write a program named Circle.java that displays the area and perimeter of
 * a Circle that has a radius of 9.5 using the following formula
 */
public class Circle {
    public static void main(String[] args) {

        double radius = 9.5;
        double area = radius * radius * Math.PI;// formula for the area of a circle
        double perimeter = 2 * radius * Math.PI;// formula for the perimeter of a circle

        System.out.println("The area of a circle is "+ area);
        System.out.println("The perimeter of a circle is "+ perimeter);
//
    }
}
