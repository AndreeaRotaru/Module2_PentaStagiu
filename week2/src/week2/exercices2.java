/*
U have the following queue : front [1, 2, -2, 9, 4, -5, 8, -8, -12, 15, 23] back
Write a java problem that orders this queue using an auxiliary stack
 */

package week2;

import java.util.PriorityQueue;

public class exercices2{
    public static void main(String[] args){
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        q.add(1);
        q.add(2);
        q.add(-2);
        q.add(9);
        q.add(4);
        q.add(-5);
        q.add(8);
        q.add(-8);
        q.add(-12);
        q.add(15);
        q.add(23);
        System.out.println(q);
}

}
