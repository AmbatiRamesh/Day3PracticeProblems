package com.switchStatement;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        char ch;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an Alphabet: ");
        ch = scan.next().charAt(0);
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}
