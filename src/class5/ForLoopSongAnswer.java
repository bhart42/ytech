/**
 * ytech

 * Created by Brian J. Hart on 11/13/17.

 * */

package class5;

/*
In your main method, modify your code so that the outro repeats
19 times using a for loop.
*/

public class ForLoopSongAnswer {
    public static void main(String[] args) {

        verse1();

        verse2();

        chorus1();

        verse3();

        chorus2();

        verse4();

        //Outro repeats 19 times.
        for(int i = 0; i < 19; i++) {
            outro();
        }
    }

    public static void verse1() {
        System.out.println("Hey Jude, don't make it bad");
        System.out.println("Take a sad song and make it better");
        System.out.println("Remember to let her into your heart");
        System.out.println("Then you can start to make it better");
        System.out.println();
    }

    public static void verse2() {
        System.out.println("Hey Jude, don't be afraid");
        System.out.println("You were made to go out and get her");
        System.out.println("The minute you let her under your skin");
        System.out.println("Then you begin to make it better");
        System.out.println();
    }

    public static void chorus1() {
        System.out.println("And anytime you feel the pain, hey Jude, refrain");
        System.out.println("Don't carry the world upon your shoulders");
        System.out.println("For well you know that it's a fool who plays it cool");
        System.out.println("By making his world a little colder");
        System.out.println();
    }

    public static void verse3() {
        System.out.println("Hey Jude, don't let me down");
        System.out.println("You have found her, now go and get her");
        System.out.println("(Let it out and let it in, Hey Jude)");
        System.out.println("Remember to let her into your heart");
        System.out.println("Then you can start to make it better");
        System.out.println();
    }

    public static void chorus2() {
        System.out.println("So let it out and let it in, hey Jude, begin");
        System.out.println("You're waiting for someone to perform with");
        System.out.println("And don't you know that it's just you, hey Jude, you'll do");
        System.out.println("The movement you need is on your shoulder");
        System.out.println();
    }

    public static void verse4() {
        System.out.println("Hey Jude, don't make it bad");
        System.out.println("Take a sad song and make it better");
        System.out.println("Remember to let her under your skin");
        System.out.println("Then you'll begin to make it");
        System.out.println("Better better better better better better, oh");
        System.out.println();
    }

    public static void outro() {
        System.out.println("Na na na na na, na na na, hey Jude");
        System.out.println("Na na na na na, na na na, hey Jude");
        System.out.println();
    }
}

