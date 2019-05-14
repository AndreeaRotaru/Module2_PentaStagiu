/*
Write a Java program to check if a positive number is a palindrome or not
 */

package exercices_java;

import java.util.Scanner;

public class exercices_13 {
    public static void main(String[] args) {
        System.out.println("Please Enter a number : ");
        int palindrome = new Scanner(System.in).nextInt();

        if (isPalindrome(palindrome)) {
            System.out.println("Number : " + palindrome + " is a palindrome");
        } else {
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }

    }

    private static boolean isPalindrome(int palindrome) {
        return false;
    }
}
