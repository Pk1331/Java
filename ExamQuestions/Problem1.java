
import java.util.Scanner;
class Main {
    public static int[] SumExceptSelf(int n, int[] arr,int th)
    {
        int[] out = new int[n];
        int total = 0;
        for(int x: arr) {
            total+=x;
        }
        for(int i=0;i<n;i++){
            int sum = total-arr[i];
            out[i] = Math.min(sum,th);
        }
       return out;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int th = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] res =  SumExceptSelf(n,arr,th);
        for(int i:res) System.out.print(i+" ");
        sc.close();
        
        
    }
}