package SL8;

public class MultiplicationTable {
    public static void main(String[] args) {
        int tableSize = 10;
        
        
        System.out.print("    "); 
        for (int i = 1; i <= tableSize; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        
        
        for (int i = 1; i <= tableSize; i++) {
            
            System.out.printf("%4d", i);
            
            for (int j = 1; j <= tableSize; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
