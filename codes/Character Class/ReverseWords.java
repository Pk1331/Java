/*
 * Write a program to reverse the words in a sentence.
 * input: "Hello World"
 * output: "olleH dlroW"
 * 
 */
import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        System.out.println("Reversed Words: " + result.toString().trim());
        sc.close();
    }
}
