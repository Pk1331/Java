import java.util.Scanner;
public class ReverseString {
    
    public static String reverse(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        String reversedString = reverse(input);
        System.out.println("Reversed string: " + reversedString);
        scanner.close();
    }
}
/*
Approach -2 (Using Recursion)
import java.util.Scanner;

public class ReverseString {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        scanner.close();
    }
 */