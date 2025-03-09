/*
 * Given a string, convert the string into a string where the uppercase letters are converted to lowercase and the lowercase letters are converted to uppercase.
 * input: Pavan, KumAR
 * output: pAVAN, kUMar
 */
import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }

        System.out.println("Toggle Case: " + result);

        sc.close();
    }
}
