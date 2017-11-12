/**
 * ytech

 * Created by Brian J. Hart on 11/11/17.

 */

package class3;

/*
In this example, we'll cover how to use variables and operators
to calculate a bill for a meal at a restaurant.

Let's say that the bill for your meal is $20, the tax is 8.1%,
and you want to leave a tip of 15% for you're nice waiter.

Assign these values to variables and make the necessary calculations
to find your total bill.  Save this value in a variable and print it
to the console.
*/

public class OperatorsAnswer {

    public static void main(String[] args) {

        double bill = 20.0;

        double tax = bill * (8.1 / 100);

        double tip = bill * (15.0 / 100);

        double totalBill = bill + tax + tip;

        System.out.println(totalBill);

    }
}
