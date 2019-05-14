/*
Write a Java program to convert a given string into lowercase
 */

package exercices_java;

import java.util.Scanner;

public class exercices_11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String:  ");
        String userInputString = scanner.nextLine();
        System.out.println("Lowercase string: "+ userInputString.toLowerCase());
    }
}
