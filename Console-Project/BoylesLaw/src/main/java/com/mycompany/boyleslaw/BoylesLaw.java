




package com.mycompany.boyleslaw;

import java.util.Scanner;

public class BoylesLaw {

    public static void main(String[] args) {
        double pressure1, volume1, pressure2, volume2;
        int choice;
        Scanner input = new Scanner(System.in);

        System.out.println("THIS SOFTWARE CALCULATES BOYLE'S LAW");
        System.out.println("Press 1 To Calculate Initial Pressure (P1)");
        System.out.println("Press 2 To Calculate Initial Volume (V1)");
        System.out.println("Press 3 To Calculate Final Pressure (P2)");
        System.out.println("Press 4 To Calculate Final Volume (V2)");
        System.out.println("Enter your choice:");
        choice = input.nextInt();

        if (choice == 1) {
            System.out.println("Enter Value for Initial Volume (V1):");
            volume1 = input.nextDouble();
            System.out.println("Enter Value for Final Pressure(P1):");
            pressure2 = input.nextDouble();
            System.out.println("Enter Value for Final Volume(V2):");
            volume2 = input.nextDouble();

            pressure1 = (pressure2 * volume2) / volume1;
            System.out.println("Initial Pressure (P1) = " + pressure1);

        } else if (choice == 2) {
            System.out.println("Enter Value for Inital Pressure(P1):");
            pressure1 = input.nextDouble();
            System.out.println("Enter Value for Final Pressure(P2):");
           pressure2 = input.nextDouble();
            System.out.println("Enter Value for Final Volume(V2):");
            volume2 = input.nextDouble();

            volume1 = (pressure2 * volume2) / pressure1;
            System.out.println("Initial Volume (V1) = " + volume1);

        } else if (choice == 3) {
            System.out.println("Enter Value for Initial Pressure(P1):");
            pressure1 = input.nextDouble();
            System.out.println("Enter Value for Initial Volume(V1):");
            volume1 = input.nextDouble();
            System.out.println("Enter Value for Final Volume(V2):");
            volume2 = input.nextDouble();

            pressure2 = (pressure1 * volume1) / volume2;
            System.out.println("Final Pressure (P2) = " + pressure2);
            
        } else if (choice == 4) {
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
    }
}

