import java.util.Scanner;
public class ASCII_String {
    
    public static void main(String[] args) {
        System.out.println("Enter a string to see ASCII values:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        printASCIIValues(userInput);
        scanner.close();
    }

    static void printASCIIValues(String str) {
        for (char c : str.toCharArray()) {
            if(Character.isLetter(c))
            {
                System.out.println("Character: " + c + ", ASCII Value: " + (int) c);
            }
           
        }
    }
}


