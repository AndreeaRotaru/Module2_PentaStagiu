/*
3)Ex (Using SWITCH)
Have int x =10; y=15;
Write a piece of code that will do the following:
If the difference between x and y 3 print out the value of y;
If the difference between x and y 9 print out the value of x;
If the difference between x and y -5 print out the value of x+y;
else print out “sorry...try again”
 */

package java_exercices;

public class exercices_3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        int result=x;

        if(x < y){
            System.out.println(("x is grater than y"));
        } if(x > y){
            System.out.println(("x is lower than y"));

        }
        switch (x-y){
            case 3: result = 10;
                System.out.println(y);
                break;
            case 9: result=15;
                System.out.println(x);
                break;
            case -5:
                System.out.println(x+y);
                break;
            default:
                System.out.println("Bla bla");
                break;
        }
    }
}