/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberrangeprinter;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class NumberRangePrinter {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scn.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scn.nextInt();

        System.out.println("Even numbers between " + firstNumber + " and " + secondNumber + ":");
        for (int i = firstNumber + 1; i < secondNumber; i++) {
            // Check if the current number is even
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        scn.close();
    }
}
