/**
 * ytech
 *
 * Created by Brian J. Hart on 11/12/17.
 */

package class4;

/*
In this program, you'll use what we learned about operators to write
a method that calculates the area of a triangle.

Recall that the area of a triangle is (base * height) / 2.
Find the area of a triangle that has a base of 6.25 feet and
a height of 3.5 feet.  Print your answer to the console with
the phrase "This triangle has an area of ____ feet".

Later, we'll learn how to generalize this method to calculate
the area of a triangle with a base and height of any size.
*/

public class TriangleAreaAnswer {

    public static void main(String[] args) {

        calculateTriangleArea();

    }

    public static void calculateTriangleArea() {

        double base = 6.25;
        double height = 3.5;

        double area = (base * height) / 2;

        System.out.println("This triangle has an area of " + area + " feet");
    }

}
