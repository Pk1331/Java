/*
 * Write a program to count the number of letters, digits, spaces and special characters in a given string.
 * input: "Pavan Kumar Ande 12345%^##"
 * output:
 * Letters: 14
 * Digits: 5
 * Spaces: 3
 * Special Characters: 5
 *     
 */
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int letterCount = 0, digitCount = 0, specialCount = 0, spaceCount = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isWhitespace(ch)) {
                spaceCount++;
            } else {
                specialCount++;
            }
        }

        System.out.println("Letters: " + letterCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Spaces: " + spaceCount);
        System.out.println("Special Characters: " + specialCount);

        sc.close();
    }
}
