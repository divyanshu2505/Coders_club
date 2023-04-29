// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        
        for(int i=N;;i++){
            int t = palindrome(i);
            if(t == 1){
                System.out.println(i);
                break;
            }
        }
    }
    public static int palindrome(int i){
         int digit = 0;
        int temp = i;
        int tp = i;
        
        while(temp != 0){
            digit++;
            temp = temp/10;
        }
        
        int pow = (int)(Math.pow(10,digit-1));
        int ans = 0;
        while(tp != 0){
            int rem = tp % 10;
            rem = rem * pow;
            ans = ans + rem;
            pow = pow / 10;
            tp = tp / 10;
        }
        // System.out.println(ans);
        if(i == ans){
            return 1;
        }
        return 0;
    }
}
