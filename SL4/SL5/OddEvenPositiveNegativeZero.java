package SL4.SL5;

import java.util.Scanner;

public class OddEvenPositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("The number is zero.");
        } else if (number > 0) {
            System.out.print("The number is positive. ");
            if (number % 2 == 0) {
                System.out.println("It's also even.");
            } else {
                System.out.println("It's also odd.");
            }
        } else {
            System.out.print("The number is negative. ");
            if (number % 2 == 0) {
                System.out.println("It's also even.");
            } else {
                System.out.println("It's also odd.");
            }
        }

        scanner.close();
    }
}
