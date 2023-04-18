// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) 
    {
        // System.out.println("Hello, World!");
        Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
         int d = scn.nextInt();
         int count = 0;
         
         
         while(n!=0){
             int ld = n % 10;
             if(ld == d){
                 count++;
             }
             n = n / 10;
         }
         System.out.print(count);
        
    }
}
