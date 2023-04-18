package com.bridgelabz;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class LineCompairison {
    public static void main(String[] args) {
        System.out.println("Wellcome to line coparison computation");

        //uc1
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the x-coordinate of the first point: ");
        double x1 = input.nextDouble();

        System.out.print("Enter the y-coordinate of the first point: ");
        double y1 = input.nextDouble();

        System.out.print("Enter the x-coordinate of the second point: ");
        double x2 = input.nextDouble();

        System.out.print("Enter the y-coordinate of the second point: ");
        double y2 = input.nextDouble();

        double length1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println("The length of the line is: " + length1);

        // for second coordinate

        System.out.println("Enter the a1-coordinate of the first point  ");
        double a1 = input.nextDouble();

        System.out.println("Enter the b1-coordinate of the first point  ");
        double b1 = input.nextDouble();

        System.out.print("Enter the x-coordinate of the second point: ");
        double a2 = input.nextDouble();

        System.out.print("Enter the y-coordinate of the second point: ");
        double b2 = input.nextDouble();

        double length2 = Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));
        System.out.println("The length of the line 2 is: " + length2);

        equals(length2,length2);
    }


        //UC_2

        // creating method to compare

         static void equals(Double length1, Double length2)
        {
            boolean result = length1.equals(length2);

            if (result == true ){
                System.out.println("both the lines are equals");
            }
            else {
                System.out.println("both the lines are not equal");
            }





    }
}
