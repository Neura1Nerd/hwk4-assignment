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

        System.out.print("Enter the first number: ");
        int firstNumber = scn.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scn.nextInt();

        System.out.println("Numbers between " + firstNumber + " and " + secondNumber + ":");
        for (int i = firstNumber + 1; i < secondNumber; i++) {
            System.out.print(i + " ");
        }

        scn.close();
    }
}
