package com.forLoop;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        String num = scanner.nextLine();
        String rn = "";
        int length = num.length();
        for ( int i = length - 1; i >= 0; i-- )
            rn = rn + num.charAt(i);
        if (num.equals(rn))
            System.out.println("The entered string " +num +" is a palindrome.");
        else
            System.out.println("The entered string " +num +"  isn't a palindrome.");
    }
}
