import java.util.Scanner;
class Main {
    public static String Pattern(String str)
    {
        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        if(Character.isLetter(str.charAt(0)))
        {
            letters.append(str.charAt(0));
        }
        else{
            numbers.append(str.charAt(0));
        }
        for(int i=1;i<str.length();i++){
            char cur = str.charAt(i);
            char prev = str.charAt(i-1);
            if( (Character.isLetter(cur) && Character.isDigit(prev) ) || (Character.isDigit(cur) && Character.isLetter(prev))){
               if(Character.isLetter(cur)){
                   letters.append(cur);
               }
               else {
                   numbers.append(cur);
               }
            }
            
        }
        return letters.toString()+numbers.toString();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(Pattern(str));
        sc.close();
        
        
    }
}