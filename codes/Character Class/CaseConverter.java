/*
 * Write a program to convert the case of a given character.
 * input: 'A'
 * output: Lowercase: a
 */

import java.util.Scanner;

public class CaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isUpperCase(ch)) {
            System.out.println("Lowercase: " + Character.toLowerCase(ch));
        } else if (Character.isLowerCase(ch)) {
            System.out.println("Uppercase: " + Character.toUpperCase(ch));
        } else {
            System.out.println("Not an alphabet.");
        }

        sc.close();
    }
}
