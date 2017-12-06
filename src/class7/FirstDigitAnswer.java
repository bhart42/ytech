/**
 * ytech
 * <p>
 * Created by Brian J. Hart on 12/6/17.
 */

package class7;

/*
Write a method that takes an integer as a parameter and returns
it's first digit.

Hint:  You will need to use a while loop to accomplish this
*/

public class FirstDigitAnswer {

    public static void main(String[] args) {
        int number = 12345;
        firstDigit(number);
    }

    public static int firstDigit(int number) {
        while (number > 10) {
            number /= 10;
        }
        return number;
    }
}
