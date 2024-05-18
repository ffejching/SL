import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int wordCount = countWords(input);
        
        System.out.println("The number of words in the input string is: " + wordCount);
        
        scanner.close();
    }

    private static int countWords(String str) {
        
        str = str.trim();
        
        
        if (str.isEmpty()) {
            return 0;
        }
        
        
        String[] words = str.split("\\s+");
        
        return words.length;
    }
}
