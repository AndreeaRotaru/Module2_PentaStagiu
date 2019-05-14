/*
 Write a Java program to print the area and perimeter and area  of a rectangle
 */

package exercices_java;

import java.util.Scanner;

public class exercices_7{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double width, heigth;
        System.out.print("Enter width of a rectangle: ");
        width = inp.nextDouble();
        System.out.print("Enter heigth of a rectangle: ");
        heigth = inp.nextDouble();

        System.out.println("Area of this rectangle is: " +
                (width * heigth));

        System.out.println("Perimeter of this rectangle is: " +
                2 * (width + heigth));

    }
}
