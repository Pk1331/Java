/*
   write a program that converts a sentence to title case.
   input: "java programming is fun"
   output: "Java Programming Is Fun"
 */
import java.util.Scanner;

public class TitleCaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();
        boolean newWord = true;

        for (char ch : str.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                newWord = true;
                result.append(ch);
            } else if (newWord) {
                result.append(Character.toUpperCase(ch));
                newWord = false;
            } else {
                result.append(Character.toLowerCase(ch));
            }
        }

        System.out.println("Title Case: " + result);

        sc.close();
    }
}
