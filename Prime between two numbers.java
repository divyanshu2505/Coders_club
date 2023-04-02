// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        // Scanner scn = new Scanner(System.in);
        // int a = scn.nextInt();
        // int b = scn.nextInt();
        int a = 55;
        int b = 75;
        
        
        for(int i=a;i<=b;i++){
            int total_factor = 0;
            for(int div=2;div*div<=i;div++){
                if(i%div==0){
                    total_factor++;
                }
            }
            
            if(total_factor == 0){
                System.out.println(i);
            }
        }
        // System.out.println(total_factor);
        
        
    }
}