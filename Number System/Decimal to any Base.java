// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        Scanner scn = new Scanner(System.in);
         
        long n = scn.nextInt();
        int base = scn.nextInt();
        long ans = 0;
        
        long pow = (long)(Math.pow(10,0));
        while(n!=0){
            long rem = n % base;
            n = n /base;
            rem = rem * pow;
            ans = ans + rem;
            pow = pow * 10;
        }
        System.out.print(ans);
    }
}
