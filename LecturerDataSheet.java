//package com.mycompany.lecturerdatasheet;

import java.util.Scanner;

/**
 *
 * @author Group A
 */
public class LecturerDataSheet {

    public static void main(String[] args) {
        computeAverageMarks();
    }

    public static void computeAverageMarks() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter marks for Java Programming: ");
        double javaMarks = scanner.nextDouble();

        System.out.print("Please enter marks for Networking: ");
        double networkingMarks = scanner.nextDouble();

        System.out.print("Please enter marks for Maths: ");
        double mathsMarks = scanner.nextDouble();

        double averageMarks = (javaMarks + networkingMarks + mathsMarks) / 3;

        System.out.println("Marks for Java Programming is: " + javaMarks);
        System.out.println("Marks for Networking is: " + networkingMarks);
        System.out.println("Marks for Maths is: " + mathsMarks);
        System.out.println("The average is: " + averageMarks);
    }
}
