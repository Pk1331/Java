/*
 * Write a program to check whether a character is a letter, digit or special character.
 * input: A
 * output: A is a Letter.
 * input: 5
 * output: 5 is a Digit.
 * input: #
 * output: # is a Special Character.    
 */
import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) {
            System.out.println(ch + " is a Letter.");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a Digit.");
        } else {
            System.out.println(ch + " is a Special Character.");
        }

        sc.close();
    }
}

