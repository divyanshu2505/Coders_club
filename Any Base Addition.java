// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int base = scn.nextInt();
        
        int ans = 0;
        int carry = 0;
        int pow = (int)(Math.pow(10,0));
        
        while(n1 != 0 || n2 != 0 || carry != 0){
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            
            int sum = d1 + d2 + carry;
            int digit = sum % base;
            digit = digit * pow;
            ans = ans + digit;
            pow = pow * 10;
            carry = sum / base;
            n1 = n1 / 10;
            n2 = n2 / 10;
        }
        System.out.println(ans);
        
    }
}