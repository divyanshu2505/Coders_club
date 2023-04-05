// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        int d=0;
        int temp = n;
        while(temp != 0){
            d++;
            temp = temp / 10;
        }
        k = k % d;
        if(k < 0){
            k = k + d;
        }
        int pow = (int)(Math.pow(10,k));
        int np = (int)(Math.pow(10,d-k));
        
        int a = n % pow;
        int b = n / pow;
        int ans = a * np + b;
        System.out.println(ans);
        
    }
}
