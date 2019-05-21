/*
You have a linked list. Create a problem that remove the sum of 2 elements of the list that equal 0 and returns the remaining list
Delete the middle element of a list
 */

package week2;

import java.util.LinkedList;

public class list {
    public static void main(String[] args){
        LinkedList object = new LinkedList();
        object.add(0, "2");
        object.add(1, "4");
        object.add(2, "7");
        System.out.println(object);
        object.remove(1);
        System.out.println(object);

    }
}
