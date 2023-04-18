// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) 
    {
        // System.out.println("Hello, World!");
        Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
         int pow = (int)Math.pow(2,0);
         int ans = 0;
         while(n != 0){
             int rem = n % 10;
             rem = rem * pow;
             ans = ans + rem;
             n = n / 10;
             pow = pow * 2;
         }
         System.out.print(ans);
        
    }
}