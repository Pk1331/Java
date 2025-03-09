import java.util.Scanner;

class CaesarCipher {
    public static String Encrypt(String str,int shift)
    {
        StringBuilder sb = new StringBuilder();
        for(char ch: str.toCharArray()){
            if(Character.isLetter(ch)){
                char base = Character.isUpperCase(ch) ? 'A':'a';
                sb.append( (char) ( (ch - base + shift)%26 + base ) );
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.nextLine();
        int shift = scan.nextInt();
        System.out.println(Encrypt(str,shift));
        scan.close();
    }
}