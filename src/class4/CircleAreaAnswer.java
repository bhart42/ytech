/**
 * ytech
 * <p>
 * Created by Brian J. Hart on 11/12/17.
 */

package class4;

/*
In this program, you'll use what we learned about operators to write
a method that calculates the area of a circle.

Recall that the area of a circle is equal to pi * (radius ^ 2).
Find the area of a circle that has a radius of 12 inches.
Print your answer to the console with a label for the units.

Later, we'll learn how to generalize this method to calculate
the area of a circle with a radius of any size.
*/

public class CircleAreaAnswer {

    public static void main(String[] args) {

        calculateCircleArea();
    }

    public static void calculateCircleArea() {

        double radius = 12.0;

        double area = Math.PI * Math.pow(radius, 2);

        System.out.println(Math.round(area) + " inches");
    }

}
