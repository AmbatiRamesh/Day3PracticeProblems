package com.operator;
import java.util.Scanner;
public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double c = scanner.nextDouble();

        double max = Math.max(Math.max(a, b), c);
        double min = Math.min(Math.min(a, b), c);

        double result1 = a + b * c;
        double result2 = c + a / b;
        double result3 = a % b + c;
        double result4 = a * b + c;

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("a + b * c = " + result1);
        System.out.println("c + a / b = " + result2);
        System.out.println("a % b + c = " + result3);
        System.out.println("a * b + c = " + result4);
    }
}
