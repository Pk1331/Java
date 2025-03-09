/*
 * write a program to encrypt a string using Caesar cipher.
 * The Caesar cipher is a type of substitution cipher in which each letter in the plaintext is 'shifted' a certain number of places down the alphabet.
 * For example, with a shift of 1, A would be replaced by B, B would become C, and so on.
 * The method is named after Julius Caesar, who apparently used it to communicate with his officials.
 * Caesar ciphers can be found in children's toys such as secret decoder rings.
 * A Caesar cipher with a shift of 1 is used to encrypt the message "HELLO" into "IFMMP".
 * Example:
 * Input: HELLO
 * shift: 1
 * Output: IFMMP
 * 
 * Input: NYTYL 
 * shift: 2
 * Output: PAVAN
 */
import java.util.Scanner;

public class CaesarCipher {
    public static String encrypt(String str, int shift) {
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                result.append((char) ((ch - base + shift) % 26 + base));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter shift value: ");
        int shift = sc.nextInt();

        System.out.println("Encrypted Text: " + encrypt(str, shift));
        sc.close();
    }
}
