/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.simplecalculator;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SimpleCalculator {

    public static void main(String[] args) {
        double firstNumber, secondNumber, result;
        int op;
        Scanner inputScanner = new Scanner(System.in);
        

            System.out.println("SIMPLE CALCULATOR");

            System.out.println("Enter Value for First Number");
            firstNumber = inputScanner.nextDouble();

            System.out.println("Follow the instruction below");
            System.out.println("Press 1 to calculate Sum (+)");
            System.out.println("Press 2 to calculate Difference (-)");
            System.out.println("Press 3 to calculate Product (x)");
            System.out.println("Press 4 to calculate Fraction (/)");
            op = inputScanner.nextInt();

            System.out.println("Enter Value for Second Number");
            secondNumber = inputScanner.nextDouble();

            if (op == 1) {
                result = firstNumber + secondNumber;
                System.out.println("Result for sum is = " + result);
            } else if (op == 2) {
                result = firstNumber - secondNumber;
                System.out.println("Result difference is = " + result);
            } else if (op == 3) {
                result = firstNumber * secondNumber;
                System.out.println("Result product is = " + result);
            } else if (op == 4) {
                if (secondNumber == 0) {
                    System.out.println("Error: Number cannot be divided by zero");
                } else {
                    result = firstNumber / secondNumber;
                    System.out.println("Result fraction is  = " + result);
                }
            } else {
                System.out.println("Error! Invalid Operator Entered, kindly follow the instuction givren, Thank you.");
        
            
        }
    }
}

