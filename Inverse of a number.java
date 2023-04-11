// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
       
        int fv = 0;
        int ans = 0;
        while(n != 0){
            fv++;
            int d = n % 10;
            int pow = (int)(Math.pow(10,d-1));
            n = n / 10;
            ans = ans + fv * pow;
        }
        System.out.println(ans);
    }
}
