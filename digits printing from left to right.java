// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        int d = 0;
        while(temp != 0){
           d++;
           temp = temp/ 10;
        }
        // System.out.println(d);
       
        int i = 0;
        int pow = 1;
        while(i < (d-1)){
            pow = pow * 10;
            i++;
        }
        
        while(d != 0){
            int first_digit = n / pow;
            System.out.println(first_digit);
            n = n % pow;
            pow = pow / 10;
            d--;
        }
        
        
    }
}