/**
 * ytech
 * <p>
 * Created by Brian J. Hart on 11/13/17.
 */

package class5;

/*
Write a method that prints out a pyramid of *'s.
Use a class constant to define the size of the pyramid.

In order to add the correct leading spaces, you'll have
to write a nested for loop, one for the spaces and one
for the stars.

Later on, we'll learn how to accept user input for the size
of the pyramid.  For now, just pass it in to the method.
*/

public class ForLoopPyramidAnswer {

    public static final int PYRAMID_SIZE = 10;

    public static void main(String[] args) {

        drawPyramid(PYRAMID_SIZE);

    }

    public static void drawPyramid(int size) {

        for (int i = 1; i <= size; i++) {
            for(int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}