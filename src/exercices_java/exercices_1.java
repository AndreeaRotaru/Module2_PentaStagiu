/*
)Ex (Using IF)
Have int x =10; y=15;
Write a piece of code that will do the following:
If the value of x is lower than the one on y it prints out a message stating that x is greater than y
If the value of x is greater than y it prints out a message stating that x is lower than y
 */
package exercices_java;

public class exercices_1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;

        if(x < y){
            System.out.println(("x is grater than y"));
        } if(x > y){
            System.out.println(("x is lower than y"));

        }
    }


}

