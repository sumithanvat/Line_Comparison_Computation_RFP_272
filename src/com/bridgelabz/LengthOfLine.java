package com.bridgelabz;

import java.util.Scanner;

public class LengthOfLine {
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

        double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println("The length of the line is: " + length);
    }
}
