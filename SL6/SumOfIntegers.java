package SL6;

import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("Enter integers (enter a non-integer value to finish):");
        
        
        while(scanner.hasNextInt()) {
            int num = scanner.nextInt();
            sum += num;
        }
        
        System.out.println("Sum of all integers entered: " + sum);
        scanner.close();
    }
}
