/**
 * ytech
 *
 * Created by Brian J. Hart on 11/12/17.
 */

package class4;

/*
In this program, you'll use what we learned about operators to write
a method that calculates the area of a rectangle.

Recall that the area of a rectangle is length * width.
Find the area of a rectangle that is 4 feet long and
3 feet wide.  Print your answer to the console with
a label for the units (square feet).

Later, we'll learn how to generalize this method to calculate
the area of a rectangle with a length and width of any size.
*/

public class RectangleAreaAnswer {

    public static void main(String[] args) {

        calculateRectArea();

    }

    public static void calculateRectArea() {

        int length = 4;
        int width = 3;

        int area = length * width;

        System.out.println(area + " square feet");
    }
}
