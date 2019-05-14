/*
4)Ex (Using WHILE)
Have int a =12; b=14;
Write a piece of code that will do the following:
While a is lower than b print out the value of a and increase a’s value by 1.
 */

package exercices_java;

public class exercices_4 {
    public static void main(String[] args) {
        int a = 12;
        int b = 14;
        while (a < b) {
            System.out.println(a);
            a++;
        }

    }
}
