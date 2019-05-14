/*
Write a Java program which iterates the integers from 1 to 100. For multiples of three print "Fizz" instead of the number and print
"Buzz" for the multiples of five. When number is divided by both three and five, print "fizz buzz"
 */

package exercices_java;

public class exercices_12 {
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("\n%d: fizz buzz",i);
            } else if (i % 5 == 0) {
                System.out.printf("\n%d: buzz",i);
            } else if (i % 3 == 0) {
                System.out.printf("\n%d: fizz",i);
            }
        }
        System.out.printf("\n");
    }

}
