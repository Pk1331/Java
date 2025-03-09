/*
 * we are given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 *  Input: "A man, a plan, a canal: Panama"
 * Output: true
 * 
 * Input: "race a car"
 * Output: false
 */
import java.util.Scanner;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder cleanStr = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                cleanStr.append(Character.toLowerCase(ch));
            }
        }
        return cleanStr.toString().equals(cleanStr.reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Is palindrome? " + isPalindrome(str));
        sc.close();
    }
}
