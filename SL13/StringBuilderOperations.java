import java.util.Scanner;

public class StringBuilderOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        
        do {
            System.out.print("Enter a string of at least 10 characters: ");
            input = scanner.nextLine();
        } while (input.length() < 10);

        StringBuilder sb = new StringBuilder(input);

        
        System.out.println("Length of the string: " + sb.length());

       
        System.out.println("First character: " + sb.charAt(0));

        
        System.out.println("Last character: " + sb.charAt(sb.length() - 1));

        
        int firstIndexOfA = sb.indexOf("a");
        if (firstIndexOfA != -1) {
            System.out.println("Index of the first occurrence of 'a': " + firstIndexOfA);
        } else {
            System.out.println("The letter 'a' is not found in the string.");
        }

        
        System.out.println("Substring from index 3 to 6: " + sb.substring(3, 7));

        
        sb.append("123");
        System.out.println("String after appending '123': " + sb);

        
        sb.insert(4, "xyz");
        System.out.println("String after inserting 'xyz' at index 4: " + sb);

        
        sb.delete(2, 4);
        System.out.println("String after deleting substring from index 2 to 4: " + sb);

       
        if (sb.length() > 8) {
            sb.deleteCharAt(8);
            System.out.println("String after deleting character at index 8: " + sb);
        } else {
            System.out.println("The string is too short to delete character at index 8.");
        }

        
        sb.reverse();
        System.out.println("Reversed string: " + sb);

        scanner.close();
    }
}
