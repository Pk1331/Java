/*
 * 
 * Write a program to remove all non-alphabetic characters from the given string.
 * input: "Hello, World!123"
 * output: "HelloWorld"
 *
 */
import java.util.Scanner;

public class RemoveNonAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                result.append(ch);
            }
        }

        System.out.println("String after removing non-alphabets: " + result);

        sc.close();
    }
}
