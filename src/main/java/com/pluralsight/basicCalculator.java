package com.pluralsight;

import java.util.Scanner;

public class basicCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.println("Possible calculations:");
        System.out.println(" (A)dd");
        System.out.println(" (S)ubtract");
        System.out.println(" (M)ultiply");
        System.out.println(" (D)ivide");

        System.out.print("Please select an option: ");
        char choice = input.next().charAt(0);

        double result = num1 * num2;

        System.out.println(num1 + " * " + num2 + " = " + result);

    }
}
