package SL9;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        
        int length = input.length();
        System.out.println("Length of the string: " + length);
        
        
        String upperCaseString = input.toUpperCase();
        System.out.println("Uppercase: " + upperCaseString);
        
        
        String lowerCaseString = input.toLowerCase();
        System.out.println("Lowercase: " + lowerCaseString);
        
        
        if (length > 0) {
            char firstChar = input.charAt(0);
            System.out.println("First character: " + firstChar);
        } else {
            System.out.println("The string is empty.");
        }
        
        
        if (length > 0) {
            char lastChar = input.charAt(length - 1);
            System.out.println("Last character: " + lastChar);
        } else {
            System.out.println("The string is empty.");
        }
        
        
        if (length >= 5) {
            String substring = input.substring(1, 5);
            System.out.println("Substring from 2nd to 5th character: " + substring);
        } else {
            System.out.println("The string is too short for a substring from the 2nd to 5th character.");
        }
        
        
        scanner.close();
    }
}
