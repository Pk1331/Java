import java.util.Scanner;
public class StringPalindrome {
    static String reverse(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
    static boolean isPalindrome(String str) {
        return str.equals(reverse(str));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check for palindrome: ");
        String str = scanner.nextLine();
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome string.");
        } else {
            System.out.println(str + " is not a palindrome string.");
        }
        scanner.close();
    }
   
}
