package com.forLoop;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = scanner.nextInt();
        int i =0;
        int sum = 0;
        for(i=1; i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum of numbers: "+sum);
    }
}
