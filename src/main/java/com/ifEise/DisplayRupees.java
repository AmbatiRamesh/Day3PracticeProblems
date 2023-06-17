package com.ifEise;

import java.util.Scanner;

public class DisplayRupees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = scanner.nextInt();
        if(n == 1){
            System.out.println("Unit");
        } else if (n == 10) {
            System.out.println("Ten");
        }
        else if (n == 100) {
            System.out.println("Hundred");
        }
        else if (n == 1000) {
            System.out.println("Thousand");
        }
        else{
            System.out.println("Enter correct number");
        }
    }
}
