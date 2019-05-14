/*
5)Ex (Using FOR)
Have int a =12; b=14;
Write a piece of code that will do the following:
Print out the difference between b and a, as many times as the value of the difference is.

 */


package exercices_java;

public class exercices_6 {
    public static void main(String[] args) {
        int a = 12;
        int b = 14;

        for (int i = 0; i < b - a; i++) {
            System.out.println(b-a);

        }
    }
}

