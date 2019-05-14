/*
Write a Java program to print the odd numbers from 1 to 99
 */

package exercices_java;

public class exercices_10 {
    public static void main(String[] args){
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}