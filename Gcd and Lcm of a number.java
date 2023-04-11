// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int min = 0;
        int gcd = 0;
    //     if(a < b){
    //         min = a;
    //     }else{
    //         min = b;
    //     }
    //     int divisor = min;
        
    //   if(a % divisor == 0 && b % divisor == 0){
    //       gcd = divisor;
    //   }else{
    //         for(int div=min/2;div >= 1;div--){
    //         if(a%div == 0 && b % div == 0){
    //             gcd = div;
    //             break;
    //         }
    //     }
    //   }
    
    //More optimization..
    int dividend = a;
    int divisor = b;
    
    while(dividend % divisor != 0){
        int rem = dividend % divisor;
        dividend = divisor;
        divisor = rem;
    }
    
    gcd = divisor;

    int lcm = (a * b)/gcd;
    
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
