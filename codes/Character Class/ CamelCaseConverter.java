/*
 * 
 * write a program that converts a sentence to camel case. The first word should be in lowercase and the first letter of each subsequent word should be in uppercase.
 * input: "to upper case"
 * output: "toUpperCase"
 * 
 */
import java.util.Scanner;

class CamelCaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();
        boolean capitalize = false;

        for (char ch : str.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                capitalize = true;
            } else {
                if (capitalize) {
                    result.append(Character.toUpperCase(ch));
                    capitalize = false;
                } else {
                    result.append(Character.toLowerCase(ch));
                }
            }
        }

        System.out.println("CamelCase: " + result);
        sc.close();
    }
}
