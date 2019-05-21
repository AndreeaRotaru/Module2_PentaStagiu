/*
5)Ex (Using DO - WHILE)
Have int a =14; b=14;
Write a piece of code that will do the following:
While a is lower than b print out the value of a and increase a’s value by 1.
 */

package exercices_java;

public class exercices_5 {
    public static void main(String[] args){
        int a = 12;
        int b = 14;

        do{
            System.out.println("Value of a is: " + a);
            a++;
        }while(a < b);

    }
}
