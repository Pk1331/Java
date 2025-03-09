/*
 * Write a program that reads a string from the user and prints the frequency of each character in the string.
 * input:"Java Programming"
 * output: 
 * J → 1
 * a → 2
 * v → 1
 * P → 1
 * r → 2                
 * o → 1
 * g → 2
 * m → 2
 * i → 2
 * n → 2
 * 
 */
import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Character Frequencies:");
        for (char key : frequencyMap.keySet()) {
            System.out.println(key + " → " + frequencyMap.get(key));
        }

        sc.close();
    }
}
