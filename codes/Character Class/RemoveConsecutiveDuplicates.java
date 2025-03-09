/*
 * 
 * write a program to remove consecutive duplicates from a string
 * input:aaaaabbbbbbcccccaabb
 * output:abcab
 */
import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();
        char prev = '\0'; // Null character

        for (char ch : str.toCharArray()) {
            if (ch != prev) {
                result.append(ch);
            }
            prev = ch;
        }

        System.out.println("After removing duplicates: " + result);
        sc.close();
    }
}
