package com.whileLoop;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = scanner.nextInt();
        int i =0;
        int sum =0;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("Total sum: " +sum);
    }
}
