package com.mycompany.multiplefunction;


import java.util.Scanner;

public class MultipleFunction {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        System.out.println("============= MULTIPLE FUNCTIONS =============");
        System.out.println("Follow the instruction below");
        System.out.println("Press 1 To Calculate Simple Interest");
        System.out.println("Press 2 To Calculate   Average of 3 Numbers");
        System.out.println("Press 3 To Caculate Area of Circle");
        System.out.println("4Press 4 To Calculate Circumference of Circle");
        System.out.println("Press 5 To Calculate Deduct 5% from Salary");
        System.out.println("Press 6 To Calculate Velocity");
        System.out.println("Press 7 To Calculate Highest of Three Numbers");
        System.out.println("Press 8 To Calculate Simple Calculator");
        System.out.println("Press 9 To  Quadratic Equation");
        System.out.println("Press 10 To Boyle's Law");
        System.out.println("Press 11 To Calculate Average of 4 Numbers");
        System.out.println("Press 12 To Calculate Highest of Four Numbers");
        System.out.println("Press 13 To Calculate Highest of Five Numbers");
        System.out.println("Press 14 To Calculate Determinant2by2");
        System.out.println("Press 15 To Calculate Determinant3by3");
        System.out.println("Press 16 To CalculateDeterminant4by4");
        System.out.println("Press 17 To Price of Mango");
        System.out.println("Press 18 To Mutiplication Table");
        System.out.println("Press 19 To Loan Application");
        System.out.println("Enter your choice:");
        choice = input.nextInt();

        if (choice == 1) {

            double principal, rate, time, simpleinterest;
            System.out.println("THIS SOFTWARE CALCULATE SIMPLE INTEREST");
            Scanner inputScanner = new Scanner(System.in);

            System.out.println("Enter Value For Principal");
            principal = inputScanner.nextDouble();

            System.out.println("Enter Value For Rate");
            rate = inputScanner.nextDouble();

            System.out.println(" Enter Value For Time");
            time = inputScanner.nextDouble();

            simpleinterest = (principal * rate * time) / 100;

            System.out.println("Simple Interest is : " + simpleinterest);

        } else if (choice == 2) {
            double firstnumber, secondnumber, thirdnumber, average;
            System.out.println("THIS SOFTWARE CALCULATE AVERAGE OF THREE NUMBERS");
            Scanner inputScanner = new Scanner(System.in);

            System.out.println("Enter Value For FIRST NUMBER1");
            firstnumber = inputScanner.nextDouble();

            System.out.println("Enter Value For SECOND NUMBER2");
            secondnumber = inputScanner.nextDouble();

            System.out.println("Enter Value For THIRD NUMBER3");
            thirdnumber = inputScanner.nextDouble();

            average = (firstnumber + secondnumber + thirdnumber) / 3;

            System.out.println("Average is : " + average);

        } else if (choice == 3) {
            double radius, area;
            Scanner inputScanner = new Scanner(System.in);

            System.out.println("THIS SOFTWARE CALCULATES AREA OF A CIRCLE");;
            System.out.println("Enter Value For  radius:");
            radius = inputScanner.nextDouble();

            area = 3.1416 * radius * radius;

            System.out.println("Area of the Circle = " + area);

        } else if (choice == 4) {
            double radius, circumference;
            Scanner inputScanner = new Scanner(System.in);

            System.out.println("THIS SOFTWARE CALCULATES CIRCUMFERENCE OF A CIRCLE");

            System.out.println("Enter Value For radius:");
            radius = inputScanner.nextDouble();

            circumference = 2 * 3.142 * radius;

            System.out.println("Circumference of the Circle = " + circumference);

        } else if (choice == 5) {
            double salary, deduction, newSalary;
            Scanner inputScanner = new Scanner(System.in);

            System.out.println("THIS SOFTWARE DEDUCTS 5% FROM STAFF SALARY");

            System.out.println("Enter Value For Staff Salary:");
            salary = inputScanner.nextDouble();

            deduction = salary * 5 / 100;
            newSalary = salary - deduction;

            System.out.println("5% Deduction = " + deduction);
            System.out.println("New Salary = " + newSalary);

        } else if (choice == 6) {
            double distance, time, velocity;
            Scanner inputScanner = new Scanner(System.in);

            System.out.println("THIS SOFTWARE CALCULATES VELOCITY");

            System.out.println("Enter Value For Distance:");
            distance = inputScanner.nextDouble();

            System.out.println("Enter Value For Time:");
            time = inputScanner.nextDouble();

            velocity = distance / time;

            System.out.println("Velocity = " + velocity);

        } else if (choice == 7) {
            double firstnumber, secondnumber, thirdnumber;
            Scanner inputScanner = new Scanner(System.in);

            System.out.println("THE SOFTWARE TO FIND HIGHEST OF THREE NUMBERS");

            System.out.println("Enter Value For First Number:");
            firstnumber = inputScanner.nextDouble();

            System.out.println("Enter Value For Second Number:");
            secondnumber = inputScanner.nextDouble();

            System.out.println("Enter Value For Third Number:");
            thirdnumber = inputScanner.nextDouble();

            if ((firstnumber > secondnumber) && (firstnumber > thirdnumber)) {
                System.out.println("First Number is the highest: " + firstnumber);
            } else if ((secondnumber > firstnumber) && (secondnumber > thirdnumber)) {
                System.out.println("Second Number is the highest: " + secondnumber);
            } else if ((thirdnumber > firstnumber) && (thirdnumber > secondnumber)) {
                System.out.println("Third Number is the highest: " + thirdnumber);
            } else {
                System.out.println("All numbers are the same");
            }

        } else if (choice == 8) {
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

        } else if (choice == 9) {
            double a, b, c, bsquare, disc, sqrtdisc, num1, num2, denom, x1, x2;
            System.out.println("THIS SOFTWARE CALCULATE QUADRATIC EQUATION");
            Scanner inputScanner = new Scanner(System.in);

            System.out.println("Enter Value For A");
            a = inputScanner.nextDouble();

            System.out.println("Enter Value For B");
            b = inputScanner.nextDouble();

            System.out.println("Enter Value For C");
            c = inputScanner.nextDouble();

            bsquare = b * b;
            disc = bsquare - (4 * a * c);
            sqrtdisc = Math.sqrt(disc);

            num1 = -b + sqrtdisc;
            num2 = -b - sqrtdisc;
            denom = 2 * a;

            x1 = num1 / denom;
            x2 = num2 / denom;

            System.out.printf("X1 is : %.2f, X2 is : %.2f%n", x1, x2);

        } else if (choice == 10) {
            double pressure1, volume1, pressure2, volume2;
            int op;

            System.out.println("THIS SOFTWARE CALCULATES BOYLE'S LAW");
            System.out.println("Press 1 To Calculate Initial Pressure (P1)");
            System.out.println("Press 2 To Calculate Initial Volume (V1)");
            System.out.println("Press 3 To Calculate Final Pressure (P2)");
            System.out.println("Press 4 To Calculate Final Volume (V2)");
            System.out.println("Enter your choice:");
            op = input.nextInt();

            if (op == 1) {
                System.out.println("Enter Value for Initial Volume (V1):");
                volume1 = input.nextDouble();
                System.out.println("Enter Value for Final Pressure(P1):");
                pressure2 = input.nextDouble();
                System.out.println("Enter Value for Final Volume(V2):");
                volume2 = input.nextDouble();

                pressure1 = (pressure2 * volume2) / volume1;
                System.out.println("Initial Pressure (P1) = " + pressure1);

            } else if (op == 2) {
                System.out.println("Enter Value for Inital Pressure(P1):");
                pressure1 = input.nextDouble();
                System.out.println("Enter Value for Final Pressure(P2):");
                pressure2 = input.nextDouble();
                System.out.println("Enter Value for Final Volume(V2):");
                volume2 = input.nextDouble();

                volume1 = (pressure2 * volume2) / pressure1;
                System.out.println("Initial Volume (V1) = " + volume1);

            } else if (op == 3) {
                System.out.println("Enter Value for Initial Pressure(P1):");
                pressure1 = input.nextDouble();
                System.out.println("Enter Value for Initial Volume(V1):");
                volume1 = input.nextDouble();
                System.out.println("Enter Value for Final Volume(V2):");
                volume2 = input.nextDouble();

                pressure2 = (pressure1 * volume1) / volume2;
                System.out.println("Final Pressure (P2) = " + pressure2);

            } else if (op == 4) {
                System.out.println("Enter Value for Initial Pressure(P1):");
                pressure1 = input.nextDouble();
                System.out.println("Enter Value for Inital Volume(V1):");
                volume1 = input.nextDouble();
                System.out.println("Enter Value for Final Voume(V2):");
                pressure2 = input.nextDouble();

                volume2 = (pressure1 * volume1) / pressure2;
                System.out.println("Final Volume (V2) = " + volume2);

            } else {
                System.out.println("Invalid Choice");
            }

        } else if (choice == 11) {
            double firstnumber, secondnumber, thirdnumber, fourthnumber, average;
            System.out.println("THIS SOFTWARE CALCULATE AVERAGE OF FOUR NUMBERS");
            Scanner inputScanner = new Scanner(System.in);

            System.out.println("Enter Value For FIRST NUMBER");
            firstnumber = inputScanner.nextDouble();

            System.out.println("Enter Value For SECOND NUMBER");
            secondnumber = inputScanner.nextDouble();

            System.out.println("Enter Value For  THIRD NUMBER");
            thirdnumber = inputScanner.nextDouble();

            System.out.println("Enter Value For  FOURTH NUMBER");
            fourthnumber = inputScanner.nextDouble();

            average = (firstnumber + secondnumber + thirdnumber + fourthnumber) / 4;

            System.out.println("Average is : " + average);

        } else if (choice == 15) {
            double a11, a12, a21, a22, determinant;

            System.out.println("THIS SOFTWARE CALCULATES DETERMINANT OF 2 BY 2 MATRIX");
            Scanner inputScanner = new Scanner(System.in);

            System.out.println("Enter Value For A11:");
            a11 = inputScanner.nextDouble();
            System.out.println("Enter Value For A12:");
            a12 = inputScanner.nextDouble();
            System.out.println("Enter Value For A21:");
            a21 = inputScanner.nextDouble();
            System.out.println("Enter Value For A22:");
            a22 = inputScanner.nextDouble();

            determinant = (a11 * a22) - (a12 * a21);

            System.out.println("Determinant = " + determinant);

            inputScanner.close();

        } else if (choice == 13) {
            double a11, a12, a13, a21, a22, a23, a31, a32, a33, determinant;

            System.out.println("THIS SOFTWARE CALCULATES DETERMINANT OF 3 BY 3 MATRIX");
            Scanner inputScanner = new Scanner(System.in);

            System.out.println("Enter Value For A11:");
            a11 = inputScanner.nextDouble();
            System.out.println("Enter Value For A12:");
            a12 = inputScanner.nextDouble();
            System.out.println("Enter Value A13:");
            a13 = inputScanner.nextDouble();
            System.out.println("Enter Value For A21:");
            a21 = inputScanner.nextDouble();
            System.out.println("Enter Value For A22:");
            a22 = inputScanner.nextDouble();
            System.out.println("Enter Value For A23:");
            a23 = inputScanner.nextDouble();
            System.out.println("Enter Value For A31:");
            a31 = inputScanner.nextDouble();
            System.out.println("Enter Value For A32:");
            a32 = inputScanner.nextDouble();
            System.out.println("Enter Value For A33:");
            a33 = inputScanner.nextDouble();

            determinant = a11 * (a22 * a33 - a23 * a32)
                    - a12 * (a21 * a33 - a23 * a31)
                    + a13 * (a21 * a32 - a22 * a31);

            System.out.println("Determinant = " + determinant);

            inputScanner.close();

        } else if (choice == 14) {
            double a11, a12, a13, a14;
            double a21, a22, a23, a24;
            double a31, a32, a33, a34;
            double a41, a42, a43, a44;
            double determinant;

            System.out.println("THIS SOFTWARE CALCULATES DETERMINANT OF 4 BY 4 MATRIX");
            Scanner inputScanner = new Scanner(System.in);

            System.out.println("Enter Value For A11:");
            a11 = inputScanner.nextDouble();
            System.out.println("Enter Value For A12:");
            a12 = inputScanner.nextDouble();
            System.out.println("Enter Value For A13:");
            a13 = inputScanner.nextDouble();
            System.out.println("Enter Value For A14:");
            a14 = inputScanner.nextDouble();

            System.out.println("Enter Value For A21:");
            a21 = inputScanner.nextDouble();
            System.out.println("Enter Value For A22:");
            a22 = inputScanner.nextDouble();
            System.out.println("Enter Value For A23:");
            a23 = inputScanner.nextDouble();
            System.out.println("Enter Value For A24:");
            a24 = inputScanner.nextDouble();

            System.out.println("Enter Value For A31:");
            a31 = inputScanner.nextDouble();
            System.out.println("Enter Value For A32:");
            a32 = inputScanner.nextDouble();
            System.out.println("Enter Value For A33:");
            a33 = inputScanner.nextDouble();
            System.out.println("Enter Value For A34:");
            a34 = inputScanner.nextDouble();

            System.out.println("Enter Value For A41:");
            a41 = inputScanner.nextDouble();
            System.out.println("Enter Value For A42:");
            a42 = inputScanner.nextDouble();
            System.out.println("Enter Value For A43:");
            a43 = inputScanner.nextDouble();
            System.out.println("Enter Value For A44:");
            a44 = inputScanner.nextDouble();

            // 4x4 Determinant formula (expansion)
            determinant = a11 * (a22 * (a33 * a44 - a34 * a43) - a23 * (a32 * a44 - a34 * a42) + a24 * (a32 * a43 - a33 * a42))
                    - a12 * (a21 * (a33 * a44 - a34 * a43) - a23 * (a31 * a44 - a34 * a41) + a24 * (a31 * a43 - a33 * a41))
                    + a13 * (a21 * (a32 * a44 - a34 * a42) - a22 * (a31 * a44 - a34 * a41) + a24 * (a31 * a42 - a32 * a41))
                    - a14 * (a21 * (a32 * a43 - a33 * a42) - a22 * (a31 * a43 - a33 * a41) + a23 * (a31 * a42 - a32 * a41));

            System.out.println("Determinant = " + determinant);

            inputScanner.close();
        

        } else if (choice == 12) {
            double firstnumber, secondnumber, thirdnumber, fourthnumber;
            Scanner inputScanner = new Scanner(System.in);

            System.out.println("THE SOFTWARE TO FIND HIGHEST OF FOUR NUMBERS");

            System.out.println("Enter Value For First Number:");
            firstnumber = inputScanner.nextDouble();

            System.out.println("Enter Value For Second Number:");
            secondnumber = inputScanner.nextDouble();

            System.out.println("Enter Value For Third Number:");
            thirdnumber = inputScanner.nextDouble();

            System.out.println("Enter Value For Fourth Number:");
            fourthnumber = inputScanner.nextDouble();

            if ((firstnumber > secondnumber) && (firstnumber > thirdnumber) && (firstnumber > fourthnumber)) {
                System.out.println("First Number is the highest: " + firstnumber);
            } else if ((secondnumber > firstnumber) && (secondnumber > thirdnumber) && (secondnumber > fourthnumber)) {
                System.out.println("Second Number is the highest: " + secondnumber);
            } else if ((thirdnumber > firstnumber) && (thirdnumber > secondnumber) && (thirdnumber > fourthnumber)) {
                System.out.println("Third Number is the highest: " + thirdnumber);
            } else if ((fourthnumber > firstnumber) && (fourthnumber > secondnumber) && (fourthnumber > thirdnumber)) {
                System.out.println("Fourth Number is the highest: " + fourthnumber);
            } else {
                System.out.println("All numbers are the same");
            }

        } else if (choice == 13) {
            double firstnumber, secondnumber, thirdnumber, fourthnumber, fifthnumber;
            Scanner inputScanner = new Scanner(System.in);

            System.out.println("THE SOFTWARE TO FIND HIGHEST OF FIVE NUMBERS");

            System.out.println("Enter Value For First Number:");
            firstnumber = inputScanner.nextDouble();

            System.out.println("Enter Value For Second Number:");
            secondnumber = inputScanner.nextDouble();

            System.out.println("Enter Value For Third Number:");
            thirdnumber = inputScanner.nextDouble();

            System.out.println("Enter Value For Fourth Number:");
            fourthnumber = inputScanner.nextDouble();

            System.out.println("Enter Value For Fifth Number:");
            fifthnumber = inputScanner.nextDouble();

            if ((firstnumber > secondnumber) && (firstnumber > thirdnumber) && (firstnumber > fourthnumber) && (firstnumber > fifthnumber)) {
                System.out.println("First Number is the highest: " + firstnumber);
            } else if ((secondnumber > firstnumber) && (secondnumber > thirdnumber) && (secondnumber > fourthnumber) && (secondnumber > fifthnumber)) {
                System.out.println("Second Number is the highest: " + secondnumber);
            } else if ((thirdnumber > firstnumber) && (thirdnumber > secondnumber) && (thirdnumber > fourthnumber) && (thirdnumber > fifthnumber)) {
                System.out.println("Third Number is the highest: " + thirdnumber);
            } else if ((fourthnumber > firstnumber) && (fourthnumber > secondnumber) && (fourthnumber > thirdnumber) && (fourthnumber > fifthnumber)) {
                System.out.println("Fourth Number is the highest: " + fourthnumber);
            } else if ((fifthnumber > firstnumber) && (fifthnumber > secondnumber) && (fifthnumber > thirdnumber) && (fifthnumber > fourthnumber)) {
                System.out.println("Fifth Number is the highest: " + fifthnumber);
            } else {
                System.out.println("All numbers are the same");
            }

        } else if (choice == 18) {

            System.out.println("THIS SOFTWARE CALCULATES MULTIPLICATION TABLE");
            System.out.println();

            System.out.println("Enter any number:");
            int number = input.nextInt();

            System.out.println("Enter the Length");
            int Length = input.nextInt();

            System.out.println();
            System.out.println("Multiplication Table of " + number);

            for (int count = 1; count <= Length; count++) {
                System.out.println(number + " x " + count + " = " + (number * count));
            }

        } else if (choice == 17) {
            double priceofone, totalprice;

            System.out.println("THIS SOFTWARE CALCULATE PRICE OF 50 MANGOS");
            Scanner inputScanner = new Scanner(System.in);

            System.out.print("Enter Price In Amount");
            priceofone = inputScanner.nextDouble();

            totalprice = priceofone * 50;

            System.out.println("Price of 50 Mango is : " + totalprice);

        } else if (choice == 19) {
            double loanAmount, monthlyPrincipal, remainingBalance;
            double monthlyInterest, totalMonthlyPayment, totalInterest = 0;
            double interestRate = 1.5;
            int months;

            System.out.println("LOAN APPLICATION");
            System.out.println();

            try {

                System.out.println("Enter Loan Amount:");
                loanAmount = input.nextDouble();

                System.out.println("Enter Loan Duration (in months):");
                months = input.nextInt();

                monthlyPrincipal = loanAmount / months;
                remainingBalance = loanAmount;

                System.out.println();
                System.out.println("========== LOAN BREAKDOWN ==========");
                System.out.println("Month\tMonthly Payment\tMonthly Interest\tTotal Monthly Payment");

                for (int count = 1; count <= months; count++) {
                    monthlyInterest = remainingBalance * interestRate / 100;
                    totalMonthlyPayment = monthlyPrincipal + monthlyInterest;
                    totalInterest = totalInterest + monthlyInterest;

                    System.out.printf("%d\tNGN %.2f\t\tNGN %.2f\t\tNGN %.2f\n",
                            count, monthlyPrincipal, monthlyInterest, totalMonthlyPayment);

                    remainingBalance = remainingBalance - monthlyPrincipal;
                }

                System.out.println();
                System.out.println("========== LOAN SUMMARY ==========");
                System.out.println("Interest Rate   = " + interestRate + "%");
                System.out.println("Total Interest  = " + totalInterest);
                System.out.println("Total Payment   = " + (loanAmount + totalInterest));
                System.out.println("=============================");

            } catch (Exception e) {
                System.out.println();
                System.out.println("Error: Invalid input! Please enter numbers only.");
            }

        }
    }
}
