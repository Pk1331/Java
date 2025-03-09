/*
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * Input: "aabbcddcef"
 * Output: "e"
 * 
 * Input: "leetcode"
 * Output: "l"
 */
import java.util.LinkedHashMap;
import java.util.Scanner;

class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.println("First non-repeating character: " + key);
                return;
            }
        }
        
        System.out.println("No non-repeating character found.");
        scan.close();
    }
}
