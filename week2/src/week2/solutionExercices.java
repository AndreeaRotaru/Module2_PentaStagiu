/*
 Reverse the word " Incomprehensibilities".
 Hint : You push the word to stack - letter by letter - and then pop letters from the stack.
 */

package week2;
import java.util.Stack;

public class solutionExercices {
    public static void main(String[] args){
        final String inputString = " Incomprehensibilities";

        final String reversed = reverseString(inputString);
        System.out.println("The reversed string is: --> " + reversed);

    }

    public static String reverseString(String originalString) {
        Stack<Character> stack = new Stack<>();
        String reversed = "";
        for (int i = 0; i < originalString.length(); i++) {
            char ch = originalString.charAt(i);
            stack.push(ch);
        }
        for (int i = 0; i < originalString.length(); i++) {
            char ch = stack.pop();
            reversed = reversed + ch;

        }
        return reversed;

    }

}