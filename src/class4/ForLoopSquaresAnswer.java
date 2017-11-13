/**
 * ytech

 * Created by Brian J. Hart on 11/11/17.

 */

package class4;

/*
Write a program that finds the square of all numbers
between 1 and 100.  Write your solution in a method
called calculateSquares and print the results to the
console using the format "___ squared is ___".

Later we'll modify the method to accept a certain range.®
*/

public class ForLoopSquaresAnswer {

    public static void main(String[] args) {

        calculateSquares();

    }

    public static void calculateSquares() {

        for (int i = 1; i <= 100; i++) {
            int square = i * i;
            System.out.println(i + " squared is " + square);
        }
    }
}
