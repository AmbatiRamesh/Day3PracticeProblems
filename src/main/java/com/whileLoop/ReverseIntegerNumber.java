package com.whileLoop;

import java.util.Scanner;

public class ReverseIntegerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = scanner.nextInt();
        int rn = 0;
        while(n != 0)
        {
            int remainder = n % 10;
            rn = rn * 10 + remainder;
            n = n/10;
        }
        System.out.println("The reverse of the given number is: " + rn);
    }
}
