/*
Use a queue to find out if a string is a palindrome
 */

package week2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class palindrom {
            public static void main(String[] args) {

                System.out.print("Enter a string:");
                Scanner in=new Scanner(System.in);
                String inputString = in.nextLine();
                Queue queue = new LinkedList();

                for (int i = inputString.length()-1; i >=0; i--) {
                    ((LinkedList) queue).add(inputString.charAt(i));
                }

                String reverseString = "";

                while (!queue.isEmpty()) {
                    reverseString = reverseString + queue.remove();
                }
                if (inputString.equals(reverseString))
                    System.out.println("The string is a palindrome.");
                else
                    System.out.println("The string is not a palindrome.");

            }
        }